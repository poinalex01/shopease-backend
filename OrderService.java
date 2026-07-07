public class OrderService {

    public void createOrder(String productName, int quantity) {
        System.out.println("[" + java.time.LocalTime.now() + "] Order created: " + quantity + "x " + productName);
    }

    public void logOrderStatus(String orderId, String status) {
        System.out.println("Order " + orderId + " status: " + status);
    }
    
    public void applyDiscount(String orderId, double percentage) {
        System.out.println("Discount of " + percentage + "% applied to order: " + orderId);
    }
    
    public void cancelOrder(String orderId) {
        System.out.println("Order cancelled: " + orderId);
    }

    public void refundOrder(String orderId, double amount) {
        System.out.println("Refund of " + amount + " issued for order: " + orderId);
    }
}