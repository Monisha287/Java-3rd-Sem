class Shape {
    // Area of square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of circle
    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);        // square
        s.area(4, 6);     // rectangle
        s.area(3.5);      // circle
    }
}