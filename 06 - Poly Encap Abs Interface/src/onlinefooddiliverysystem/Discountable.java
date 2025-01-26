package onlinefooddiliverysystem;

// Interface: Discountable
interface Discountable {
    // Applying discount to the food item
    void applyDiscount(double discountPercentage);

    // Getting details of the applied discount
    String getDiscountDetails();
}
