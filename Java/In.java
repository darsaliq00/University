// Shape class
class Shape {
    // Method to get area (to be overridden by subclasses)
    public double getArea() {
        return 0.0;  // Placeholder implementation, overridden in subclasses
    }
}

// Rectangle subclass extending Shape
class Rectangle extends Shape {
    // Fields specific to Rectangle
    private double length;
    private double width;
    
    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Override getArea() to calculate area of Rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Create an object of Shape class (not very useful since it's abstract)
        Shape shape = new Shape();
        // double area = shape.getArea();  // This would compile but not be useful
        
        // Create an object of Rectangle class
        Rectangle rectangle = new Rectangle(5, 3);
        // Call getArea() method of Rectangle class
        double area = rectangle.getArea();
        System.out.println("Area of rectangle: " + area);  // Output: Area of rectangle: 15.0
    }
}
