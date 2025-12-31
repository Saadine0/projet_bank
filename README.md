# 🏦 Projet Bank

A Java-based **banking microservices system** built with **Spring Boot**.  
This project consists of several services to manage bank accounts, transactions, and reporting in a modular and scalable architecture.:contentReference[oaicite:1]{index=1}

---

## 📌 Overview

This project simulates the core backend services of a banking system, allowing clients to create accounts, process transactions, and generate reports — implemented as independent services:

| Service | Description |
|---------|-------------|
| **compte-service** | Manages customer bank accounts (creation, balance, etc.). |
| **transaction-service** | Handles deposits, withdrawals, transfers, and transaction history. |
| **reporting-service** | Generates reports based on account and transaction data. |

Each service is a separate **Spring Boot microservice** in this repository.:contentReference[oaicite:2]{index=2}

---

## 🚀 Getting Started

### 📥 Prerequisites

Make sure you have the following installed:

- Java 17+ (JDK)
- Maven 3.6+
- Docker (optional, for running with containers)
- PostgreSQL / other DB (or in-memory DB for testing)

---

### 🛠 Running Each Service

Navigate into each service folder and run with Maven:

```bash
# In a terminal
cd compte-service
mvn clean install
mvn spring-boot:run

cd ../transaction-service
mvn clean install
mvn spring-boot:run

cd ../reporting-service
mvn clean install
mvn spring-boot:run
