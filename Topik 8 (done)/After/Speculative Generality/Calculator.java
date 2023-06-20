public class Calculator {

    public static void add(double num1, double num2){
        System.out.println(num1 + num2);
    }

    public static void substract(double num1, double num2){
        System.out.println(num1 - num2);
    }

    public static void multiply(double num1, double num2){
        System.out.println(num1 * num2);
    }

    public static void divide(double num1, double num2){
        System.out.println(num1 / num2);
    }

    public static void modulo(double num1, double num2){
        System.out.println(num1 % num2);
    }

    public static void invalid(double num1, double num2){
        System.out.println("Invalid operator!");
    }

    public static void main(String[] args) {
        Calculator.add(10, 5); // output: 15.0
        Calculator.substract(10, 5); // output: 5.0
        Calculator.multiply(10, 5); // output: 50.0
        Calculator.divide(10, 5); // output: 2.0
        Calculator.modulo(10, 5); // output: 0.0
        Calculator.invalid(10, 5); // output: Invalid operator!
    }
}
