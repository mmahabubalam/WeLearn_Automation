# 🧠 Welearn Automation Project

Welcome to the **Welearn Automation Project** — an automated testing framework for the **Welearn Learning Platform**, designed to validate key e-learning workflows such as course creation, e-detailing, and content submission.

---

## 🚀 Project Overview

**Welearn** is an online learning management system that allows users to create, manage, and interact with educational content.  
This automation project focuses on testing core functionalities through browser automation to ensure smooth user experience and reliability.

---

## 🧩 Automated Features

### 1️⃣ Course Creation
- Automates creating a new course.
- Inputs **Course Title (English & Bangla)** and **Description (English & Bangla)**.
- Selects **Category**, **Sub-Category**, and **Brand**.
- Chooses **Level**, **Type**, and **Master sections** (System, Area, Disease, Specification).
- Uploads course image and sets toggle options (Active, Open for All, IsCourse).
- Submits and verifies successful creation.

### 2️⃣ e-Detailing Creation
- Automates creating a new **e-Detailing**, which includes video/audio-based learning materials.
- Handles file uploads and input validations.
- Verifies that content saves successfully and appears in the list.

### 3️⃣ e-Detailing Assignment
- Automates assigning created e-Detailings to employees.
- Selects **Employee(s)** and **Reviewer** from dropdown lists.
- Sets **Deadlines** using a calendar date picker.
- Confirms successful assignment through UI validation.

### 4️⃣ e-Detailing Submission
- Automates submission of an e-Detailing by uploading a **video or audio file** from the local machine.
- Validates that the submission is stored and visible under the assigned records.

---

## 🖼️ Feature Showcase

### 📘 1. Course Creation Page

The **Course Creation** page allows users to create a new learning course by entering all required details such as titles, descriptions, category, and brand selection.

Below is the interface automated in this project:

![Welearn Course Creation](f40a243f-6772-42c1-bfc4-bd8a181cb24a.png)

**Automated Steps:**
- Enter English & Bangla course titles and descriptions  
- Select Category, Sub-Category, Brand, Level, Type, and Masters (System, Area, Disease, Specification)  
- Upload a course image  
- Configure switches such as `Active`, `Open for All`, and `IsCourse`  
- Choose content show type (`One By One` or `All`)  
- Submit the form successfully  

This ensures that the **course creation workflow** functions smoothly with all required validations and dropdown selections.

---

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

## ⚙️ Project Structure

