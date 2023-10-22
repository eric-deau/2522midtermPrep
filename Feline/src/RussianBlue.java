public class RussianBlue extends Tiger {
    public void walk() {
        super.walk();
        System.out.println("RussianBlue is walking");
    }

    public static void main(String[] args) {
        Feline f = new RussianBlue();
        f.walk();
    }
}
