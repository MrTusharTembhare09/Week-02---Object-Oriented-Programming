package ecommerceplatform;

// Subclass: Clothing
class Clothing extends Product implements Taxable {
    private String size; // Size of the clothing item

    // Constructor for initializing Clothing attributes
    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    // Getting clothing size
    public String getSize() {
        return size;
    }

    // Setting clothing size
    public void setSize(String size) {
        this.size = size;
    }

    // Calculating discount for clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    // Calculating tax for clothing
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    // Getting tax details for clothing
    @Override
    public String getTaxDetails() {
        return "Tax for Clothing is 5%.";
    }
}
