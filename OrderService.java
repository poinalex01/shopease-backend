public class OrderService {

    public void createOrder(String productName, int quantity) {
        System.out.println("Order created: " + quantity + "x " + productName);
    }

    public void cancelOrder(String orderId) {
        System.out.println("Order cancelled: " + orderId);
    }
}