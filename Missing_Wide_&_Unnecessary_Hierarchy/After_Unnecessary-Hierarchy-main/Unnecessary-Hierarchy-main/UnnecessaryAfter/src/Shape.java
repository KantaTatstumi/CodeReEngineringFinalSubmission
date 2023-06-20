class Circle extends base {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        // TODO Auto-generated method stub
        return 0;
    }
}

class Rectangle extends base {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateVolume() {
        // TODO Auto-generated method stub
       return 0;
    }
}

class Sphere extends base {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return (4 *Math.PI *radius);
    }
}

class Cube extends base{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return (12 *side);
    }

    
}
