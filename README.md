# Spring-AI-RAG

# Ollama Embedding with PDF Reader (Spring AI)

This project demonstrates how to generate embeddings from a PDF document using **Spring AI** and store them in a **VectorStore** for RAG (Retrieval-Augmented Generation).

Instead of crawling web content, this project reads and processes a local PDF file, converts it into chunks, and stores the embeddings.

---

## ✅ Features

- Read text from a PDF file using **Apache PDFBox**
- Convert PDF pages into **Spring AI Documents**
- Split large text using **TokenTextSplitter**
- Store embeddings into a **VectorStore**
- Ready to be used for **RAG (Question Answering)**

---

## ✅ Requirements

Before you begin, make sure you have installed:

| Requirement          | Version |
|---------------------|----------|
| Java                | 17+      |
| Maven               | 3.8+     |
| Ollama (running)    | latest   |
| Spring Boot         | 3.x      |

---

## ✅ Setup

1. Clone the repository
   ```bash
   git clone https://github.com/your-repo/ollama-embedding.git
   cd ollama-embedding

