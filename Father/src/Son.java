public class Son extends Father {
    public final void argue() {
        System.out.println("Rude");
        super.talk();
    }

    public static void main(String[] args) {
        Father s = new Son();
        s.talk();
//        s.argue();
    }
}
