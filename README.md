# Veeva System Testing Demo 🚀

<p align="center">
  <img src="https://demolab.com" alt="Animated Banner" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white" alt="Selenium"/>
  <img src="https://img.shields.io/badge/TestNG-FFB000?style=for-the-badge" alt="TestNG"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven"/>
</p>

## 📌 About This Branch
This **orphan branch** is a dedicated demo environment created to perform, validate, and debug automated test cases without affecting the main codebase.

**Purpose:**
* ✅ **Isolate Test Execution:** Run experimental tests safely.
* ✅ **Practice Frameworks:** Hands-on implementation of Selenium & TestNG.
* ✅ **Debug & Fix:** Analyze failures and improve script reliability.

---

## 🛠️ Test Scenarios Covered

| ID | Test Scenario | Status | Tools Used |
|---|---|---|---|
| **TS_01** | Login Functionality Validation | ✅ **Pass** | Selenium, TestNG |
| **TS_02** | User Registration Form | 🔄 **In Progress** | Selenium, Faker |
| **TS_03** | Search & Filter Results | ⏳ **Pending** | Selenium, Waits |
| **TS_04** | API Response Validation | ⏳ **Pending** | REST Assured |

---

## 📂 Project Structure

```bash
VeevaTesting/
├── src/
│   ├── main/java/       # Utility classes & Base pages
│   └── test/java/       # Test scripts & TestNG suites
├── pom.xml              # Maven dependencies
└── testng.xml           # Test suite configuration
```

## 🎯 Testing Workflow

```mermaid
flowchart LR
    A[Write Test Script] --> B[Run via TestNG]
    B --> C{Pass?}
    C -->|Yes| D[Mark Complete]
    C -->|No| E[Debug Logs]
    E --> F[Refactor Code]
    F --> B
    style A fill:#dbeafe,stroke:#2563eb
    style C fill:#fef3c7,stroke:#d97706
    style D fill:#dcfce7,stroke:#16a34a
```

---

<p align="center">
  <strong>Built for Learning • Executed for Quality</strong>
</p>
