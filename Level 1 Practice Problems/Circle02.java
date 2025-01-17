class Circle {
    double radius;

    // Defining of a constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2.0);
    }

    // Method to calculate circumference of a circle
    double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class Circle02 {
    public static void main(String[] args) {
        double radius = 2.5;

        // Creating an object for Circle class
        Circle c1 = new Circle(radius);
        double area = c1.areaOfCircle(radius);
        double circumference = c1.circumference(radius);

        //Printing the result
        System.out.println("Area of a circle is : " + area);
        System.out.println("Circumference of a circle is : " + circumference);
    }
}
