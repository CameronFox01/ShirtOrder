# Shirt Order – User Guide

## Overview

**Shirt Order** is a simple desktop application that helps you quickly count and summarize shirt orders. Instead of manually tallying sizes, you paste in a list of sizes and the app automatically calculates totals for **Gendered** and **Unisex** shirts.

This guide explains:

1. How to use the application
2. How to create a desktop shortcut (Windows)

---

## System Requirements

* Windows 10 or newer
* No Java installation required (Java is bundled with the app)

---

## Folder Setup (Important)

After extracting the ZIP file, your folder **must stay intact**.

Correct folder structure:

```
ShirtOrder/
 ├─ ShirtOrder.exe
 ├─ ShirtOrderFX.jar
 └─ jre/
```

⚠️ Do **not** move or delete files inside this folder. The application depends on them.

---

## How to Launch the Application

1. Open the `ShirtOrder` folder
2. Double-click **`ShirtOrder.exe`**
3. The application window will open

---

## How to Use the Application

### Step 1: Enter Sizes

* In the **Enter List** text box, paste or type one item per line
* Sizes are **case-insensitive** (they will be converted automatically)

Example input:

```
S
M
L
XL
LS
LM
LXL
```

---

### Step 2: Click Enter

* Press the **Enter** button
* The application will process the list

---

### Step 3: View Results

* **Gendered Sizes** (middle column):

  * Displays totals for gendered sizing (counts are doubled automatically)

* **Unisex Sizes** (right column):

  * Displays totals converted into unisex sizes

Results update every time you press **Enter**.

---

## Supported Size Codes

### Gendered Sizes

* S, M, L, XL
* 2XL, 3XL, 4XL
* LXS, LS, LM, LL, LXL

### Unisex Conversion Rules

* LXS, LS, LM → S
* LL → M
* LXL → L

---

## Creating a Desktop Shortcut (Windows)

### Method 1: Right-Click (Recommended)

1. Open the `ShirtOrder` folder
2. Right-click **`ShirtOrder.exe`**
3. Select **Show More Options** then selected **Create shortcuts**
4. Feel free to rename and place wherever you want.

You can double-click it to launch the app.

---

### Method 2: Drag and Drop

1. Open the `ShirtOrder` folder
2. Right-click **`ShirtOrder.exe`**
3. Drag it to the Desktop
4. Release the mouse and choose **Create shortcut here**

---

## Important Notes

* Always launch the app using **`ShirtOrder.exe`** (not the `.jar`)
* Do not rename or move files inside the `ShirtOrder` folder
* If the app does not open, ensure all files were extracted from the ZIP

---

## Troubleshooting

**The app does not open:**

* Make sure `ShirtOrder.exe`, `ShirtOrderFX.jar`, and the `jre` folder are all present
* Do not run the EXE from inside the ZIP file

**Results look incorrect:**

* Check that each size is on its own line
* Verify size codes are supported

---

## Author

Cameron Fox

---

Thank you for using **Shirt Order**!

