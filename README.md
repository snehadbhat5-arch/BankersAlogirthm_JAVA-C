# BankersAlogirthm_JAVA-C
Banker’s Algorithm – Java Frontend with C Backend
A desktop application that demonstrates Banker’s Algorithm for Deadlock Avoidance, using a Java Swing GUI as the frontend and a C program as the backend for algorithm execution.
# Project Overview
Banker’s Algorithm is a deadlock avoidance algorithm used in Operating Systems to determine whether resource allocation will leave the system in a safe state.
In this project:
 C implements the core Banker’s Algorithm logic
 Java Swing provides a graphical user interface
 Java executes the compiled C program and displays its output
 # Features
✔ Implements Banker’s Algorithm
✔ Checks whether the system is in a SAFE or UNSAFE state
✔ Displays a valid Safe Sequence if one exists
✔ Java frontend communicates with C backend
✔ Simple and user-friendly GUI
✔ Suitable for OS lab / academic project
# Technologies Used
C – Backend algorithm implementation
Java (Swing) – Frontend GUI
GCC – Compiling C program
VS Code – Development environment
Windows OS
# Project Structure
BankersAlgo/
│

├── bankers.c # C implementation of Banker’s Algorithm

├── bankers.exe  # Compiled C executable

├── BankersFrontend.java   # Java Swing frontend

├── README.md              # Project documentation

# How to Run the Project
1️. Compile the C Program
## gcc bankers.c -o bankers.exe
2️. Compile Java Program
## javac BankersFrontend.java
3️. Run the Java Frontend
## java BankersFrontend
4️. Click
## “Run Banker’s Algorithm”
# Sample Output
System is in SAFE state
Safe sequence: P1 P3 P4 P0 P2

->>This confirms that all processes can complete without deadlock.
# Screenshot
<img width="602" height="418" alt="image" src="https://github.com/user-attachments/assets/1f2e2220-92e9-4af8-bf28-aefad00228e6" />

# Algorithm Explanation (Brief)
Calculates Need = Max − Allocation
Checks resource availability before granting requests
Ensures system remains in a safe state
Produces a safe execution order if possible
# Academic Use
This project is ideal for:
Operating Systems Lab
Deadlock Avoidance Demonstration
Mini Project / Case Study
# Future Enhancements
Take dynamic input from GUI
Display matrices (Allocation, Max, Need)
Support multiple test cases
Improve UI styling
# Author
Sneha D Bhat
📚 Computer Science Student
💡 Interested in OS, Java & System Programming
