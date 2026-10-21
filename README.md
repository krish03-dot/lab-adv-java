# Advanced Java Programming Laboratory & Enterprise Capstone

[![Java 21](https://img.shields.io/badge/Java-21-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Apache Tomcat 11](https://img.shields.io/badge/Apache_Tomcat-11.0-F8DC75?style=flat-square&logo=apache-tomcat&logoColor=black)](https://tomcat.apache.org/)
[![Jakarta EE 10](https://img.shields.io/badge/Jakarta_EE-10-F05032?style=flat-square&logo=eclipse-ide&logoColor=white)](https://jakarta.ee/)
[![MySQL 8.0](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat-square&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![Build Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![University RTU Syllabus](https://img.shields.io/badge/University-RTU_Syllabus-00599C?style=flat-square)]()

A comprehensive, industry-aligned repository covering the entire Advanced Java Laboratory Curriculum (Experiments 1 through 7) alongside **ShopSphere**, a complete N-Tier enterprise e-commerce capstone application.

---

## Table of Contents

- [Repository Overview](#repository-overview)
- [Directory Structure](#directory-structure)
- [Experiments (1 to 7)](#experiments-1-to-7)
  - [Experiment 1: Student Registration GUI (Java Swing)](#experiment-1-student-registration-gui-java-swing)
  - [Experiment 2: Calculator following MVC Architecture](#experiment-2-calculator-following-mvc-architecture)
  - [Experiment 3: Java Database Connectivity (JDBC)](#experiment-3-java-database-connectivity-jdbc)
  - [Experiment 4: TCP Socket Client-Server Network Programming](#experiment-4-tcp-socket-client-server-network-programming)
  - [Experiment 5: Remote Method Invocation (Java RMI)](#experiment-5-remote-method-invocation-java-rmi)
  - [Experiment 6: Jakarta Servlet, Filters, Sessions & Listeners](#experiment-6-jakarta-servlet-filters-sessions--listeners)
  - [Experiment 7: HTML to Dynamic JSP Conversion & Expression Language](#experiment-7-html-to-dynamic-jsp-conversion--expression-language)
- [Capstone Project: ShopSphere Enterprise Suite](#capstone-project-shopsphere-enterprise-suite)
- [Software Prerequisites & Environment](#software-prerequisites--environment)
- [Execution & Verification Guide](#execution--verification-guide)
- [Common Troubleshooting](#common-troubleshooting)
- [Author & Academic Credits](#author--academic-credits)

---

## Repository Overview

| Experiment / Module | Topic / Focus | Key Technologies | Location |
|---|---|---|---|
| **Experiment 1** | GUI Design & Event Handling | Java Swing, `JFrame`, `ActionListener` | `Experiment 1 - STDregistration` |
| **Experiment 2** | Model-View-Controller (MVC) Pattern | Swing GUI, Decoupled Architecture | `Experiment 2 - Calc` |
| **Experiment 3** | Database CRUD Operations | JDBC, `PreparedStatement`, MySQL 8 | `Experiment 3 - JDBC` |
| **Experiment 4** | Network Stream Programming | `java.net.Socket`, `ServerSocket`, TCP | `Experiment 4 - ServerClient` |
| **Experiment 5** | Distributed Systems & Remoting | Java RMI, Remote Interface, Registry | `Experiment 5 - RMI` |
| **Experiment 6** | Server-Side Web Programming | Jakarta Servlets, `HttpSession`, Filters | `Experiment 6 - servlet` |
| **Experiment 7** | Dynamic Presentation & MVC View | JSP, Expression Language (EL), JSTL | `Experiment 7 - html_to_jsp` |
| **Capstone** | Full E-Commerce Platform | Servlets + JSP + Swing Admin + JDBC Pool | `Project - ShopSphere` |

---

## Directory Structure

```text
ADV. JAVA LAB /
├── Experiment 1 - STDregistration/           # Student Registration GUI (Swing)
│   └── StudentRegistration.java
├── Experiment 2 - Calc/                      # MVC Swing Calculator
│   ├── Model.java
│   ├── View.java
│   ├── Controller.java
│   └── Main.java
├── Experiment 3 - JDBC/                      # JDBC Database Operations
│   ├── lib/
│   │   └── mysql-connector-j-26.7.0.jar
│   └── src/
│       └── App.java
├── Experiment 4 - ServerClient/              # TCP Socket Communication
│   ├── Server.java
│   └── Client.java
├── Experiment 5 - RMI/                       # Remote Method Invocation (RMI)
│   ├── Calc.java
│   ├── Calc_Implementation.java
│   ├── Server.java
│   └── Client.java
├── Experiment 6 - servlet/                   # Jakarta Servlet Web Application
│   ├── pom.xml
│   └── src/main/
│       ├── java/com/servlet/
│       │   ├── HelloServlet.java
│       │   ├── LoginServlet.java
│       │   ├── HomeServlet.java
│       │   ├── AuthFilter.java
│       │   └── AppListener.java
│       └── webapp/
│           ├── index.html
│           └── student.html
├── Experiment 7 - html_to_jsp/               # HTML to JSP Conversion & EL
│   └── servlet/
│       ├── pom.xml
│       └── src/main/
│           ├── java/com/servlet/
│           │   └── HelloServlet.java
│           └── webapp/
│               ├── index.jsp
│               ├── student.jsp
│               └── result.jsp
└── Project - ShopSphere/                     # Capstone: ShopSphere E-Commerce System
    ├── pom.xml
    ├── database/
    │   ├── shopsphere.sql
    │   └── seed-data.sql
    ├── shopsphere-core/                      # POJO Domain Models, Connection Pool, DAOs
    ├── shopsphere-desktop/                   # Swing Desktop Admin Application
    ├── shopsphere-network/                   # TCP Socket Server & Client
    ├── shopsphere-rmi/                       # Distributed RMI Remote Inventory
    ├── shopsphere-web/                       # Jakarta Servlet 6.0 & JSP Web Application
    ├── run-desktop.bat                       # 1-Click Launcher for Swing Desktop Admin
    ├── run-network-server.bat                # 1-Click Launcher for Socket Server
    ├── run-network-client.bat                # 1-Click Launcher for Socket Client
    ├── run-rmi-server.bat                    # 1-Click Launcher for RMI Server
    ├── run-rmi-client.bat                    # 1-Click Launcher for RMI Client
    └── import-database.bat                   # 1-Click Database Setup Script for MySQL
```

---

## Experiments (1 to 7)

### Experiment 1: Student Registration GUI (Java Swing)

- **Objective:** Design a graphical user interface for a student registration form using Java Swing components and event listeners.
- **Key Components:** `JFrame`, `JLabel`, `JTextField`, `JRadioButton` with `ButtonGroup`, `JCheckBox`, `JButton`, and `JOptionPane`.
- **Validation Features:** Ensures all required fields (Name, Roll Number, Gender, Branch, Terms Agreement) are populated; outputs formatted dialog upon submission and supports form clearing on reset.
- **Execution:**
  ```bash
  cd "Experiment 1 - STDregistration"
  javac StudentRegistration.java
  java StudentRegistration
  ```

---

### Experiment 2: Calculator following MVC Architecture

- **Objective:** Build an arithmetic calculator implementing strict separation of concerns using the Model-View-Controller design pattern.
- **Architecture:**
  - **Model (`Model.java`):** Contains pure arithmetic operations (`add`, `subtract`, `multiply`, `divide`). Handles zero-division safely.
  - **View (`View.java`):** Pure UI presentation using Swing components with no calculation logic.
  - **Controller (`Controller.java`):** Implements `ActionListener`, extracts input values from View, delegates computation to Model, and updates View result.
  - **Entry Point (`Main.java`):** Bootstraps and binds the MVC triad.
- **Execution:**
  ```bash
  cd "Experiment 2 - Calc"
  javac *.java
  java Main
  ```

---

### Experiment 3: Java Database Connectivity (JDBC)

- **Objective:** Connect Java applications to relational database management systems using JDBC, execute parameterized queries, and read result sets.
- **Database Setup:**
  ```sql
  CREATE DATABASE clg;
  USE clg;
  CREATE TABLE student (
      id INT PRIMARY KEY,
      name VARCHAR(30),
      branch VARCHAR(20)
  );
  ```
- **Key Components:**
  - `Class.forName("com.mysql.cj.jdbc.Driver")` / `DriverManager`: Dynamic driver loading into JVM memory.
  - `DriverManager.getConnection(...)`: Manages connection handshakes to `jdbc:mysql://localhost:3306/clg`.
  - `PreparedStatement`: Parameterized insert (`INSERT INTO student VALUES (?, ?, ?)`) preventing SQL injection.
  - `Statement` & `ResultSet`: Executes queries and navigates cursor rows.
- **Execution:**
  ```bash
  cd "Experiment 3 - JDBC"
  javac -cp "lib/*;src" -d bin src/App.java
  java -cp "lib/*;bin" App
  ```

---

### Experiment 4: TCP Socket Client-Server Network Programming

- **Objective:** Implement connection-oriented network communication using stream sockets in the `java.net` package.
- **Key Components:**
  - **Server (`Server.java`):** Listens on port 5000 via `ServerSocket`, accepts incoming connection via `accept()`, reads message via `BufferedReader`, and sends response via auto-flushing `PrintWriter`.
  - **Client (`Client.java`):** Connects to `localhost:5000`, transmits `"Hello Server"`, reads server response, and closes socket connection.
- **Execution:**
  - **Terminal 1 (Server):**
    ```bash
    cd "Experiment 4 - ServerClient"
    javac Server.java
    java Server
    ```
  - **Terminal 2 (Client):**
    ```bash
    cd "Experiment 4 - ServerClient"
    javac Client.java
    java Client
    ```

---

### Experiment 5: Remote Method Invocation (Java RMI)

- **Objective:** Develop a distributed Java application where a client calls methods of an object residing in a different JVM over the network.
- **Architecture:**
  - **Remote Interface (`Calc.java`):** Extends `java.rmi.Remote`, declares remote methods (`add`, `sub`) throwing `RemoteException`.
  - **Remote Object (`Calc_Implementation.java`):** Extends `UnicastRemoteObject`, implements business arithmetic logic.
  - **Server (`Server.java`):** Creates remote object instance, initializes registry on port 1099, and binds it via `Naming.rebind("rmi://localhost:1099/Calculator", obj)`.
  - **Client (`Client.java`):** Locates remote reference via `Naming.lookup()` and invokes remote methods transparently.
- **Execution:**
  - **Terminal 1 (Server):**
    ```bash
    cd "Experiment 5 - RMI"
    javac *.java
    java Server
    ```
  - **Terminal 2 (Client):**
    ```bash
    cd "Experiment 5 - RMI"
    java Client
    ```

---

### Experiment 6: Jakarta Servlet, Filters, Sessions & Listeners

- **Objective:** Study server-side Java programming with Jakarta Servlets on Apache Tomcat 11.
- **Key Components:**
  - `HelloServlet.java`: Demonstrates `doGet()` and `doPost()` request handling.
  - `LoginServlet.java`: Authenticates credentials, creates server-side `HttpSession`, and stores session attributes.
  - `AuthFilter.java` (`@WebFilter`): Intercepts incoming requests to protect resources from unauthenticated access.
  - `HomeServlet.java`: Protected servlet rendering user state from session.
  - `AppListener.java` (`@WebListener`): Lifecycle tracking application startup and shutdown events.
- **Build & Deployment:**
  ```bash
  cd "Experiment 6 - servlet"
  mvn clean package
  # Output: target/servlet.war -> Deploy to Tomcat webapps/
  ```

---

### Experiment 7: HTML to Dynamic JSP Conversion & Expression Language

- **Objective:** Convert static HTML forms into dynamic JavaServer Pages (JSP), separating presentation from controller logic using Expression Language (EL).
- **Key Components:**
  - `student.jsp`: User input view with page directives and registration form.
  - `HelloServlet.java`: Controller reading parameters, attaching data to request scope via `request.setAttribute()`, and forwarding via `RequestDispatcher`.
  - `result.jsp`: Dynamic view rendering parameters using Expression Language (`${name}`, `${email}`, `${course}`, `${age}`) without scriptlets.
- **Build & Deployment:**
  ```bash
  cd "Experiment 7 - html_to_jsp/servlet"
  mvn clean package
  # Output: target/servlet.war -> Deploy to Tomcat webapps/
  ```

---

## Capstone Project: ShopSphere Enterprise Suite

**ShopSphere** is a complete, production-grade e-commerce application engineered for the RTU Advanced Java Capstone requirement.

```text
+---------------------------------------------------------------+
|                 ShopSphere Enterprise Suite                   |
+-------------------------------+-------------------------------+
|       Web Client Portal       |   Desktop Admin Suite (Swing) |
| (Jakarta Servlets, JSP, EL)   |   (JTable, KPI Dashboard, MVC)|
+-------------------------------+-------------------------------+
|                         Service Layer                         |
|         (CartService, OrderService, AuthenticationFilter)      |
+-------------------------------+-------------------------------+
|                           DAO Layer                           |
|      (UserDAO, ProductDAO, CategoryDAO, OrderDAO, CartDAO)    |
+-------------------------------+-------------------------------+
|                 High-Performance Connection Pool              |
|             (Dynamic Proxy Recycling, 127.0.0.1 Direct)       |
+-------------------------------+-------------------------------+
|                       MySQL 8.0 Database                      |
|           (ACID Transactions, InnoDB Engine, Schema Seed)     |
+-------------------------------+-------------------------------+
```

### Core Architecture Highlights:

1. **Dual Access Modalities:**
   - **Web Storefront:** Responsive customer portal for catalog browsing, keyword search, cart management, checkout, and order history.
   - **Desktop Administration Suite (`DesktopAdminApp.java`):** Standalone Swing GUI featuring live KPI revenue cards, low-stock threshold alerts, catalog CRUD, order fulfillment status updates, and customer account moderation.
2. **High-Performance Connection Pool (`DBConnection.java`):**
   - Zero-dependency connection pool utilizing standard library dynamic proxies to recycle open physical TCP sockets.
   - Eliminates Windows IPv6 resolution latency by binding directly to `127.0.0.1`.
   - Reduces database query response times to sub-millisecond speeds.
3. **Optimized Front-End Rendering:**
   - Asynchronous lazy image decoding (`loading="lazy" decoding="async"`).
   - Zero-latency inline SVG fallback to prevent layout shifts.
   - Resource hints (`dns-prefetch`, `preconnect`) for Bootstrap CDN.
4. **Pre-Configured Evaluation Accounts:**
   - **Administrator:** `admin@shopsphere.com` / `Password@123`
   - **Customer:** `rahul@example.com` / `Password@123`
   - Includes 1-click credential autofill buttons on the login screen.

---

## Software Prerequisites & Environment

- **Java Development Kit (JDK):** Version 17 or 21 (`java -version`, `javac -version`)
- **Web Server:** Apache Tomcat 11.0+ (Jakarta EE 10 compliant)
- **Database:** MySQL Server 8.0+ listening on port `3306` (Default user: `root`)
- **Build System:** Apache Maven 3.9+ (includes repository wrapper `mvn.cmd`)
- **Operating System:** Microsoft Windows 10 / 11

---

## Execution & Verification Guide

### 1. Starting the MySQL Service
Ensure the MySQL service is running in Windows:
- Press <kbd>Win</kbd> + <kbd>R</kbd>, type `services.msc`, locate **MySQL80**, and click **Start**.
- Or run in an Administrator command prompt / PowerShell:
  ```powershell
  net start MySQL80
  ```

### 2. Setting Up the Database
Import the initial schema and seed data:
```powershell
cd "Project - ShopSphere"
.\import-database.bat
```
*(Alternatively, manually import `database/shopsphere.sql` and `database/seed-data.sql` via MySQL Workbench or CLI).*

### 3. Deploying and Running ShopSphere
1. Build the multi-module project:
   ```powershell
   mvn clean package
   ```
2. Copy `shopsphere-web/target/shopsphere-web.war` to your `<TOMCAT_HOME>/webapps/` folder.
3. Start Apache Tomcat:
   ```powershell
   & "<TOMCAT_HOME>\bin\startup.bat"
   ```
4. Open in browser: [http://localhost:8080/shopsphere-web/](http://localhost:8080/shopsphere-web/)

### 4. Running the Desktop Swing Admin Suite
Double-click `run-desktop.bat` or execute:
```powershell
cd "Project - ShopSphere"
.\run-desktop.bat
```

### 5. Running Additional Services
- **TCP Socket Server (Port 9090):** `.\run-network-server.bat`
- **TCP Socket Client:** `.\run-network-client.bat`
- **RMI Registry & Server (Port 1099):** `.\run-rmi-server.bat`
- **RMI Client:** `.\run-rmi-client.bat`
- **Object Serialization Demo:** `.\run-serialization-demo.bat`

---

## Common Troubleshooting

| Issue / Error | Root Cause | Solution |
|---|---|---|
| `CommunicationsException: Communications link failure` | MySQL service is stopped. | Start MySQL80 via `services.msc` or `net start MySQL80`. |
| `ClassNotFoundException: com.mysql.cj.jdbc.Driver` | JDBC driver JAR is missing from classpath. | Ensure `-cp "lib/*"` or Maven dependency is included. |
| `Address already in use: bind (Port 8080)` | Another process is holding Tomcat port. | Stop existing Tomcat instance or kill conflicting process. |
| `Connection refused: localhost:5000 / 1099` | Server not started before client. | Ensure `Server.java` is running in a terminal before running `Client.java`. |
| `HTTP 404 Not Found` | Context path mismatch or WAR not deployed. | Verify application is deployed in Tomcat's `webapps/` folder. |

---

## Author & Academic Credits

- **Project:** RTU Advanced Java / Java Enterprise Laboratory Suite
- **Technologies:** Java SE, Java Swing, JDBC, Java Sockets, Java RMI, Jakarta Servlets, JSP, JSTL, Apache Tomcat, MySQL
- **Year:** 2026
