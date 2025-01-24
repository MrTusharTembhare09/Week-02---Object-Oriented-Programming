// Defining the base class Order
class Order {
    String orderId;
    String orderDate;

    // Adding constructor to initialize Order attributes
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Defining a method to display order details
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    // Defining a method to get the current order status
    public String getOrderStatus() {
        return "Order placed";
    }
}

// Defining the subclass ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    // Adding constructor to initialize ShippedOrder attributes
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding the displayDetails() method to include tracking number
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    // Overriding the getOrderStatus() method
    @Override
    public String getOrderStatus() {
        return "Order shipped";
    }
}

// Defining the subclass DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Adding constructor to initialize DeliveredOrder attributes
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding the displayDetails() method to include delivery date
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    // Overriding the getOrderStatus() method
    @Override
    public String getOrderStatus() {
        return "Order delivered";
    }
}

// Main class to demonstrate the Online Retail Order Management system
public class OrderManagementSystem {
    public static void main(String[] args) {
        // Creating an Order object
        Order order = new Order("ORD001", "2025-01-20");
        
        // Creating a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-21", "TRK123456");
        
        // Creating a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-22", "TRK654321", "2025-01-23");

        // Displaying details and status of each order
        System.out.println("Order Details:");
        System.out.println("--------------");
        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println();
        System.out.println("Shipped Order Details:");
        System.out.println("-----------------------");
        shippedOrder.displayDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        System.out.println();
        System.out.println("Delivered Order Details:");
        System.out.println("-------------------------");
        deliveredOrder.displayDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}