public class EnumDemo {
    public static void main(String[] args) {
        Order order = new Order("515", OrderStatus.PLACED);
        order.displayStatus();

        Order order1 = new Order("505", OrderStatus.SHIPPED);
        order1.displayStatus();

        Order order2 = new Order("555", OrderStatus.OUTFORDELIVERY);
        order2.displayStatus();

        Order order3 = new Order("115", OrderStatus.DELIVERED);
        order3.displayStatus();

        Order order4 = new Order("551", OrderStatus.CANCELLED);
        order4.displayStatus();
    }
}

enum OrderStatus {
    PLACED,
    SHIPPED,
    OUTFORDELIVERY,
    DELIVERED,
    CANCELLED;
}

class Order {
    private String orderId;
    private OrderStatus status;

    Order(String Id, OrderStatus s) {
        this.orderId = Id;
        this.status = s;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }

    public void displayStatus() {
        System.out.println("Your Order " + this.orderId + " has been " + status);
    }
}