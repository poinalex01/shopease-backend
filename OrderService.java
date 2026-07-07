public class OrderService {

    public void createOrder(String productName, int quantity) {
        System.out.println("Order created: " + quantity + "x " + productName);
    }

    public void logOrderStatus(String orderId, String status) {
        System.out.println("Order " + orderId + " status: " + status);
    }
    
    public void cancelOrder(String orderId) {
        System.out.println("Order cancelled: " + orderId);
    }
}