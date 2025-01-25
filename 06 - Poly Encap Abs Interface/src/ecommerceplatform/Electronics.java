package ecommerceplatform;

// Subclass: Electronics
class Electronics extends Product implements Taxable {
    private double warrantyPeriod; // Warranty period in years

    // Constructor for initializing Electronics attributes
    public Electronics(int productId, String name, double price, double warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Getting warranty period
    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Setting warranty period
    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    // Calculating discount for electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    // Calculating tax for electronics
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    // Getting tax details for electronics
    @Override
    public String getTaxDetails() {
        return "Tax for Electronics is 18%.";
    }
}
