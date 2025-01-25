package ecommerceplatform;

// Subclass: Groceries
class Groceries extends Product {
    private double weight; // Weight of the grocery item in kilograms

    // Constructor for initializing Groceries attributes
    public Groceries(int productId, String name, double price, double weight) {
        super(productId, name, price);
        this.weight = weight;
    }

    // Getting weight of the grocery item
    public double getWeight() {
        return weight;
    }

    // Setting weight of the grocery item
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Calculating discount for groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
