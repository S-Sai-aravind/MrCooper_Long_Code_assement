# MrCooper_Long_Code_assement
#🗳️ Voting System (Java – OOP Based)

##📌 Overview

This project is a simple Voting System implemented in Java using Object-Oriented Programming concepts. It simulates core functionalities of an election process including voter registration, candidate management, voting, and result declaration.

The system was developed as part of a coding assessment to demonstrate understanding of:

- OOP principles (Encapsulation, Inheritance)
- Basic data structures (ArrayList)
- Input handling using Scanner
- System design for real-world scenarios

--- 

##⚙️ Features

###👤 Voter Management

Register voters with ID, name, and age
Eligibility check (must be 18+)
Prevent duplicate or invalid registrations
Track voting status (voted / not voted)

###🧑‍💼 Candidate Management

Add candidates with ID, name, and party
Maintain candidate list for election

###🗳️ Voting Process

Voters can cast their vote
Prevent multiple voting by the same voter
Vote count maintained per candidate

###📊 Election Management

Create election with start and end dates
Add candidates to election
Declare results based on highest votes

---

##🏗️ Project Structure
VotingSystem.java
│

├── Voter           # Handles voter registration and voting

├── candidate       # Stores candidate details and vote count

├── Election        # Manages candidates and election results

├── VoteRecord      # (Placeholder) for storing vote logs

└── VotingSystem    # Main class (execution starts here)

---

##▶️ How to Run

Compile the program:
javac VotingSystem.java
Run the program:
java VotingSystem
Provide input based on options:
Input	Action
1	Register Voter
2	Add Candidate
3	Cast Vote
4	Declare Result
Other	Exit

---

##⚠️ Known Issues / Limitations

Candidate objects are not centrally managed (design limitation)
Voting currently does not map correctly to stored candidates
declareResult() may return incorrect results due to object handling
No persistence (data lost after program ends)
Minimal validation and error handling

---

##🔧 Possible Improvements

Maintain a centralized candidate list
Fix vote mapping to actual candidate objects
Implement proper result calculation
Add database support (MySQL / MongoDB)
Build REST API using Spring Boot
Add frontend (React / Web UI)
Implement authentication & security

---

##📚 Concepts Used

Classes and Objects
Inheritance (Election extends candidate)
Encapsulation (private variables + methods)
Collections (ArrayList)
Control flow and loops

---

##🎯 Purpose

This project is intended for:

Learning OOP design in Java
Practicing system-level problem solving
Demonstrating coding skills in assessments/interviews

---

##👨‍💻 Author

Sai Aravind
Computer Science Student
