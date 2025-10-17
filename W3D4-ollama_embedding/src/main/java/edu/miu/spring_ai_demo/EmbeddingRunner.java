package edu.miu.spring_ai_demo;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.document.Document;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmbeddingRunner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(EmbeddingRunner.class);

    @Autowired
    private VectorStore vectorStore;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Running EmbeddingRunner with PDF Reader...");
        //Already in documentation, not yet in production!
        //JsoupDocumentReader reader = new JsoupDocumentReader();

        //Crawl pages
//        WebCrawler crawler = new WebCrawler("docs.spring.io");
//        crawler.setUrlContains(List.of("spring-ai/reference"));
//        crawler.setUrlNotContains(List.of("#", "/1.0/"));
//        crawler.setMaxPages(150);
//        crawler.setDelayMs(100);

//        List<Document> pages = crawler
//            .crawl("https://docs.spring.io/spring-ai/reference/");
//
//        TokenTextSplitter splitter = new TokenTextSplitter();

        PdfReader reader = new PdfReader("w1d1.pdf");
        List<Document> documents = reader.read();


        logger.info("Adding documents to vector store...");
        vectorStore.add(documents);
        logger.info("Done!");
    }
}


