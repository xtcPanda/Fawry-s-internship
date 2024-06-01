import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customerList;

    public CustomerManager() {
        customerList = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void removeCustomer(int customerId) {
        customerList.removeIf(customer -> customer.getId() == customerId);
    }

 
    public void viewAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("No customers found. Please add a new customer.");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
