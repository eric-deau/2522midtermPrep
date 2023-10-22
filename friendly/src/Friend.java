public class Friend extends Me {
    protected void talk() {
        greet();
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Friend f = new Friend();
        f.talk();
    }
}
