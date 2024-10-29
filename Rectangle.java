public class Rectangle {

    // Fields to store the length and width of the rectangle
    private double length; 
    private double width;
 
    // Constructor that allows setting custom length and width
    public Rectangle(double length, double width) {
        this.setLength(length); // Use the setLength method to initialize the length
        this.setWidth(width);   // Use the setWidth method to initialize the width
    }
 
    // Default constructor that sets length and width to default values
    public Rectangle() {
        this.setLength(2.5); // Default length is 2.5
        this.setWidth(4.4);  // Default width is 4.4
    }
    
    // Setter method to set the length of the rectangle
    public void setLength(double length) {
        this.length = length; // Assigns the input value to the length field
    }
 
    // Getter method to retrieve the length of the rectangle
    public double getLength() {
        return length; // Returns the current value of length
    }
 
    // Setter method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width; // Assigns the input value to the width field
    }
 
    // Getter method to retrieve the width of the rectangle
    public double getWidth() {
        return width; // Returns the current value of width
    }
 
    // Method to calculate the perimeter of the rectangle
    public double perimeter() {
        return 2 * (length + width); // Calculates perimeter using the formula 2 * (length + width)
    }
 
    // Method to calculate the area of the rectangle
    public double area() {
        return length * width; // Calculates area using the formula length * width
    }
 
    // Method to return a string with details of the rectangle's length, width, perimeter, and area
    public String info() {
        return "length: " + getLength() + "\nwidth: " + getWidth() +
               "\nperimeter: " + perimeter() + "\narea: " + area();
        // Constructs a string with the rectangle's length, width, perimeter, and area
    }

    public void test(){
        System.out.println("Test");
    }
 }