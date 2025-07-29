<h1 align="center">
   Bank Simplified Backend
</h1>

<p align="center">
  <img alt="challenge" src="https://badgen.net/badge/PicPay/Challenge/b">

  <a href="https://github.com/Zagetsus">
    <img alt="Made by Luan Verdelho" src="https://badgen.net/badge/made by/Luan Verdelho/b">
  </a>

  <img alt="Project" src="https://badgen.net/badge/Project/Backend/b">
</p>


A simplified banking system built with **Spring Boot 3**, designed to manage users and transactions while providing basic financial operations.  
This project was developed as part of a technical challenge for a **Senior Backend Engineer** position at PicPay.

---

## 📌 Features

- ✅ User creation and listing
- 💸 Transaction management between users
- 📬 Email notification after transactions are completed
- 🌐 RESTful API architecture
- 🛠️ Exception handling and input validation
- 🌍 Internationalization-ready (texts migrated to English)
- 🔌 In-memory H2 database for testing and local development

---

## 🧱 Tech Stack

| Layer            | Technology           |
|------------------|----------------------|
| Language         | Java 21              |
| Framework        | Spring Boot 3        |
| Database         | H2 (in-memory)       |
| ORM              | Spring Data JPA      |
| Build Tool       | Maven                |
| Dependency Mgmt  | Spring Boot Starter  |
| Others           | Lombok, DevTools     |

---

## 🚀 How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/Zagetsus/bank-simplified-backend.git
   cd bank-simplified-backend


2. **Run with Maven (Spring Boot DevTools enabled)**

   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access H2 Console**

    * URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
    * JDBC URL: `jdbc:h2:mem:testdb`
    * Username: `sa`
    * Password: (leave blank)

---

## 🗂️ Project Structure

```
src/
 └─ main/
     └─ java/
         └─ com.banksimplifiedbackend/
             ├─ controllers/        # HTTP layer (REST endpoints)
             ├─ domain/             # Domain models and business logic
             ├─ dtos/               # Data Transfer Objects
             ├─ infra/              # Infrastructure/configuration
             ├─ repositories/       # Data access layer (JPA Repositories)
             └─ services/           # Business service layer
```

---

## 📄 Main Endpoints

| Method | Endpoint           | Description          |
| ------ | ------------------ | -------------------- |
| POST   | `/users`           | Create a new user    |
| GET    | `/users`           | List all users       |
| POST   | `/transactions`    | Create a transaction |

---

## 🧑‍💻 Author

Made with ❤️ by **Luan Verdelho**
[GitHub](https://github.com/Zagetsus)


