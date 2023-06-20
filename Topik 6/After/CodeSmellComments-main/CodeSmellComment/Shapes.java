
public void getValue(int type, int side, int width) {

   
    if (type == 1) {
        int square = side * side;
    } else if (type == 2) {
        int rectangle = side * width;
    } else if (type == 3) {
        int circle = 3.14 * side * side;
    }

    // prints out the area for user
    System.out.println("Area of " + shapeType + " : " + area);
}

class Main {
    public static void main(String[] args) {
         int value = 9;
         
        // getting areas
        getValue(1, value, 0);
        getValue(2, value, value);
        getValue(3, value, 0);
    }
}
