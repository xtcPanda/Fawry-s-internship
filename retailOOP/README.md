# E-Commerce Application

This is a simple console-based E-Commerce application developed in Java. It allows users to manage products, customers, and orders using Object-Oriented Programming (OOP) principles.

## Table of Contents

- [Classes and Relationships](#classes-and-relationships)
- [Main Application](#main-application)
- [Instructions](#instructions)
- [Requirements](#requirements)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Classes and Relationships

### Product
- Attributes:
  - id (int)
  - name (String)
  - description (String)
  - price (double)
  - stockQuantity (int)
- Methods:
  - Constructors, getters, setters, toString()

### Customer
- Attributes:
  - id (int)
  - name (String)
  - email (String)
  - address (String)
- Methods:
  - Constructors, getters, setters, toString()

### Order
- Attributes:
  - id (int)
  - customer (Customer)
  - productList (List of Product)
  - totalAmount (double)
- Methods:
  - Constructors, getters, setters, calculateTotalAmount(), toString()

### OrderManager
- Attributes:
  - orderList (List of Order)
- Methods:
  - addOrder(Order order), removeOrder(int orderId), viewAllOrders()

### CustomerManager
- Attributes:
  - customerList (List of Customer)
- Methods:
  - addCustomer(Customer customer), removeCustomer(int customerId), viewAllCustomers()

### ProductManager
- Attributes:
  - productList (List of Product)
- Methods:
  - addProduct(Product product), removeProduct(int productId), viewAllProducts(), updateStock(int productId, int newStock)

## Main Application

The main application class (`App.java`) provides a simple text-based menu for interacting with the user. It allows the user to:

1. Add a new product
2. Remove a product
3. View all products
4. Add a new customer
5. Remove a customer
6. View all customers
7. Create a new order
8. View all orders
9. Exit

## Instructions

To run the application:

1. Clone the repository:
```git clone <repository-url>```


2. Navigate to the project directory:
```cd e-commerce-application```


3. Compile the Java files:
```javac *.java```


4. Run the application:
```java App```


## Requirements

- Java Development Kit (JDK) 8 or higher

## Usage

- Follow the on-screen instructions to perform various operations.
- Input data as requested to manage products, customers, and orders.

## Contributing

Contributions are welcome. If you find any issues or have suggestions for improvements, please create an issue or a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
