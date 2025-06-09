# Mobile Shopping Application using Java & JDBC
This project is a console-based shopping application developed in Java using JDBC (Java Database Connectivity) to connect and interact with a relational database. It simulates a basic e-commerce experience, allowing users to browse products, manage carts, and place orders.

# Key Features:
  📦 View available mobile products with details (brand, model, price, quantity).
  
  ➕ Add products to the shopping cart.
  
  🛍️ Place an order and generate a basic order summary.
  
  🗃️ Interact with a relational database (like MySQL) to store and retrieve product and order details.
  
  ✅ Input validation and simple error handling.

# Technologies Used:
  1) Java – Core application logic
  2) JDBC (Java Database Connectivity) – For database interaction
  3) MySQL / Any RDBMS – To manage product and order data

# Project Structure:
1) ├── src/
2) │   ├── Main.java               # Application entry point
3) │   ├── DBConnection.java       # Database connection logic
4) │   ├── Product.java            # Product entity class
5) │   ├── Cart.java               # Shopping cart logic
6) │   ├── Order.java              # Order processing
7) └── README.md                   # Project overview and instructions

# How to Run the Application:

  # 1) Clone the repository:
    git clone https://github.com/Shandeepsugumar/Java-JDBC.git
    cd Java-JDBC
  # 2) Set up your MySQL database:
  i) Create a database and required tables (products, orders, etc.)
  ii) Update your DB credentials in DBConnection.java
  # 3) Compile and run the project
   # Use your favorite IDE or run:
    javac *.java
    java Main

# Learning Highlights:
  1) Practical use of JDBC for database operations (CRUD)
  2) Clear application of object-oriented programming principles
  3) Console-based user interaction
  4) Working with SQL queries from Java

# License:
This project is open-source and available under the MIT License.


