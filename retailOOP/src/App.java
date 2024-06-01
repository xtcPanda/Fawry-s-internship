import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();
        OrderManager orderManager = new OrderManager();

        while (true) {
            System.out.println("1. Add a new product");
            System.out.println("2. Remove a product");
            System.out.println("3. View all products");
            System.out.println("4. Add a new customer");
            System.out.println("5. Remove a customer");
            System.out.println("6. View all customers");
            System.out.println("7. Create a new order");
            System.out.println("8. View all orders");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new product
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product description: ");
                    String productDescription = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter product stock quantity: ");
                    int productStock = scanner.nextInt();
                    Product product = new Product(productId, productName, productDescription, productPrice, productStock);
                    productManager.addProduct(product);
                    break;
                case 2:
                    // Remove a product
                    System.out.print("Enter product ID to remove: ");
                    int removeProductId = scanner.nextInt();
                    productManager.removeProduct(removeProductId);
                    break;
                case 3:
                    // View all products
                    productManager.viewAllProducts();
                    break;
                case 4:
                    // Add a new customer
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer email: ");
                    String customerEmail = scanner.nextLine();
                    System.out.print("Enter customer address: ");
                    String customerAddress = scanner.nextLine();
                    Customer customer = new Customer(customerId, customerName, customerEmail, customerAddress);
                    customerManager.addCustomer(customer);
                    break;
                case 5:
                    // Remove a customer
                    System.out.print("Enter customer ID to remove: ");
                    int removeCustomerId = scanner.nextInt();
                    customerManager.removeCustomer(removeCustomerId);
                    break;
                case 6:
                    // View all customers
                    customerManager.viewAllCustomers();
                    break;
                case 7:
                    // Create a new order
                    System.out.print("Enter order ID: ");
                    int orderId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer ID for the order: ");
                    int orderCustomerId = scanner.nextInt();
                    Customer orderCustomer = null;
                    for (Customer c : customerManager.getCustomerList()) {
                        if (c.getId() == orderCustomerId) {
                            orderCustomer = c;
                            break;
                        }
                    }
                    if (orderCustomer == null) {
                        System.out.println("Customer not found.");
                        break;
                    }
                    List<Product> orderProductList = new ArrayList<>();
                    while (true) {
                        System.out.print("Enter product ID to add to the order (0 to stop): ");
                        int orderProductId = scanner.nextInt();
                        if (orderProductId == 0) {
                            break;
                        }
                        Product orderProduct = null;
                        for (Product p : productManager.getProductList()) {
                            if (p.getId() == orderProductId) {
                                orderProduct = p;
                                break;
                            }
                        }
                        if (orderProduct == null) {
                            System.out.println("Product not found.");
                        } else {
                            orderProductList.add(orderProduct);
                        }
                    }
                    Order order = new Order(orderId, orderCustomer, orderProductList);
                    orderManager.addOrder(order);
                    break;
                case 8:
                    // View all orders
                    orderManager.viewAllOrders();
                    break;
                case 9:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}