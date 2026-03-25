📘 Notes Sharing Web Application (Advance Java Project)
📌 Project Overview

This project is a Notes Sharing Web Application developed using Advance Java Technologies.
It allows users to Register, Login, Create Notes, View Notes, Update Notes, Delete Notes, and Share Notes with other users.

The system is designed using MVC Architecture and follows a proper project structure using Servlet, JSP, JDBC, and MySQL Database.


🚀 Features

🔐 User Authentication

User Registration

User Login

User Logout

Session Management

Secure Access Control

Only logged-in users can access application features.



📝 Notes Management

Users can:


Add Notes (Question & Answer Format)

View All Shared Notes

View Own Notes

Update Notes

Delete Notes

👥 Shared Notes Feature

All users can see shared notes

Users can manage only their own notes

Collaborative learning environment




🏗️ Technologies Used

Frontend Technologies

HTML, 
CSS, 
Bootstrap, 
JSP.

Backend Technologies

Java Servlet, 
JDBC, 
Session Management, 
Database
MySQL Database, 
JDBC Database Connectivity.

📂 Project Structure

📁 src/main/java

🔹 Dao Package

Handles Database Operations

UserDao.java → User Registration & Login

NotesDao.java → Notes CRUD Operations

🔹 Entity Package

Entity Classes for Database Mapping

User.java → User Entity

Notes.java → Notes Entity

🔹 Servlet Package

Handles Business Logic

LoginServlet.java → User Login

LogoutServlet.java → User Logout

InsertServlet.java → Add Notes

UpdateServlet.java → Update Notes

DeleteServlet.java → Delete Notes

ShowServlet.java → Show User Notes

NotesServlet.java → Display Shared Notes

HomeServlet.java → Home Page

EditServlet.java → Edit Notes


🔹 Utility Package

DB.java → Database Connection Class

📁 Webapp Folder


JSP Pages

index.jsp → Landing Page

login.jsp → Login Page

register.jsp → Registration Page

Home.jsp → Dashboard

Add Note.jsp → Add Notes

Show Notes.jsp → Show User Notes

Update.jsp → Update Notes

logout.jsp → Logout Page




Used for UI Styling

All Components


Reusable Components:


navbar.jsp

footer.jsp

allcdn.jsp

WEB-INF

web.xml configuration




🔄 Application Workflow

1️⃣ User Registration


User enters details

Data stored in database

User registered successfully


2️⃣ User Login

User enters credentials

Database verification

Session created

Redirect to dashboard

3️⃣ Add Notes

User adds Question

User adds Answer

Notes stored in database

4️⃣ View All Notes

All users' notes displayed

Collaborative learning

5️⃣ Show My Notes


User can:


View own notes

Update notes

Delete notes

6️⃣ Update Notes

Edit Question


Edit Answer

Update Database

7️⃣ Delete Notes

Remove notes

Delete from database

8️⃣ Logout

Session destroyed

Redirect to login page

