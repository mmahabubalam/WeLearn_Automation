# 🧠 Welearn Automation Project

Welcome to the **Welearn Automation Project** — an automated testing framework for the **Welearn Learning Platform**, designed to validate key e-learning workflows which user frequently.

---

## 🚀 Project Overview

**Welearn** is an online learning management system that allows users to create, manage, and interact with educational content.  
This automation project focuses on testing core functionalities through browser automation to ensure smooth user experience and reliability.

---

## 🧩 Automated Features

1. **Course Creation** — Logs in, switches to the Training Management module, fills in course details, and submits to create a new empty course.
2. **Course Assignment** — Filters and selects a course, assigns it to an employee with a set deadline, and confirms submission.
3. **Course Completion** — Logs in as the assigned employee, opens the course content, watches it, and marks it as complete.
4. **e-Detailing Assignment** — Selects an e-Detailing (Video, Test, or Exam), assigns an employee and reviewer, and submits.
5. **e-Detailing Submission** — From the assigned employee's account, uploads the required media file and submits the task.
6. **e-Detailing Review** — From the reviewer's account, opens the pending submission and completes the review workflow.

---

## 🖼️ Feature Showcase

### 📘 1. Course Creation
Logs into the platform and navigates to the **Training Management** module. Opens the Create New Course page, fills in the course title (English & Bangla), description, category, sub-category, brand, level, type, and master sections (System, Area, Disease, Specification). Uploads a course image, configures toggles (`Active`, `Open for All`, `IsCourse`), and submits to create a new empty course.

---

### 📗 2. Course Assignment
Navigates to the course assignment interface and uses the filter panel to locate the target course. Searches for the intended employee by name, selects them from the results, sets the course deadline via the date picker, and submits the assignment.

---

### 📙 3. Course Completion
Logs in as the assigned employee and navigates to the assigned course. Opens the designated content, completes the watch interaction, and clicks the **Complete** button. The updated completion status is verified in the UI.

---

### 📕 4. e-Detailing Assignment
Navigates to the **e-Detailing** section from the main menu. Selects the target material — Video, Test, or Exam — then assigns the appropriate employee and reviewer from the dropdown lists. Submits and confirms the assignment is recorded in the list.

---

### 📓 5. e-Detailing Submission
Switches to the assigned employee's account and opens the pending e-Detailing task. Uploads the required video or audio file from the local machine, submits the entry, and verifies it is stored correctly under the assigned records.

---

### 📔 6. e-Detailing Review
Logs in from the reviewer's account and navigates to the submission pending evaluation. Opens the assigned e-Detailing, completes the review actions as per the platform workflow, and finalizes the review. The updated status is verified in the system.
## 🧰 Tech Stack

| Tool / Library | Purpose |
|----------------|----------|
| **Selenium WebDriver** | Browser automation |
| **Java** | Programming language |
| **TestNG / JUnit** | Test management and assertions |
| **Maven** | Build and dependency management |
| **Page Object Model (POM)** | Framework design pattern |
| **Git & GitHub** | Version control and collaboration |

---


