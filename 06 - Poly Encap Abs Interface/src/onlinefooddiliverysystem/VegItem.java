package onlinefooddiliverysystem;

// Subclass: VegItem
class VegItem extends FoodItem implements Discountable {
    private double discount;

    // Constructor for VegItem
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    // Calculating total price for veg item
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discount;
    }

    // Applying discount to veg item
    @Override
    public void applyDiscount(double discountPercentage) {
        discount = getPrice() * getQuantity() * (discountPercentage / 100);
    }

    // Getting discount details for veg item
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}
