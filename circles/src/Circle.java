public class Circle extends Shape {
    private int radius = 1;

    Circle(int circleRadius) {
       radius = circleRadius;
       System.out.println("Constructing Circle with radius " + radius);
    }

    void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    public static void main(String[] args) {
        Circle orbit = new Circle(5);
    }
}
