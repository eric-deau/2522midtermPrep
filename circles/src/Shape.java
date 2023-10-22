abstract class Shape {
    public Shape() {
        System.out.println("Instantiating a Shape");
        draw();
        System.out.println("Finished instantiating a Shape");
    }

    void draw() {
        System.out.println("Drawing a Shape");
    }
}
