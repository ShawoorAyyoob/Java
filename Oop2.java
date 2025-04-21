public class Oop2 {
    public static void main(String[] args) {
        Product product1 = new Product("S24 Ultra", 70000);
        product1.displayProduct();

        Product product2 = new Product("Note 24", 50000);
        product2.displayProduct();

        Product product3 = new Product("RayBan", 2700);
        product3.displayProduct();
    }
}

class Product {
    String name;
    int price;

    Product(String n, int p) {
        this.name = n;
        this.price = p;
    }

    void displayProduct() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
