package onlinefooddiliverysystem;

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    // Constructor for NonVegItem
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    // Calculating total price for non-veg item
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + additionalCharge) - discount;
    }

    // Applying discount to non-veg item
    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (getPrice() * getQuantity() + additionalCharge) * (discountPercentage / 100);
    }

    // Getting discount details for non-veg item
    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount;
    }
}
