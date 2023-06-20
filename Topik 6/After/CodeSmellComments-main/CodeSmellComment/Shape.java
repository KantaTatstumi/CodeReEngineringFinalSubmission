public class Shape {
    public static void getValue(String type, int side, int width) {

        if (type == "Square") {
            int square = side * side;
        } else if (type == "Rectangle") {
            int rectangle = side * width;
        } else if (type == "Circle") {
            Double circle = 3.14 * side * side;
        }
    
        // prints out the area for user
        System.out.println("Area of " + type + " : ");
    }
    
    public static void main(String[] args) {
         int value = 9;       
      // getting areas
        getValue("Square", value, 0);
        getValue("Rectangle", value, value);
        getValue("Circle", value, 0);

    }
}
