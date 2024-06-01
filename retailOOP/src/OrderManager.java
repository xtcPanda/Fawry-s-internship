import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orderList;

    public OrderManager() {
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(int orderId) {
        orderList.removeIf(order -> order.getId() == orderId);
    }


    public void viewAllOrders() {
        if (orderList.isEmpty()) {
            System.out.println("No orders found. Please create a new order.");
        } else {
            for (Order order : orderList) {
                System.out.println(order);
            }
        }
    }
}
