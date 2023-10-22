public class SilverTray {
    static Cup firstCup;
    static Cup secondCup;

    static {
        firstCup = new Cup(1);
        secondCup = new Cup(2);
    }

    SilverTray(String guest) {
        System.out.println("Constructing SilverTray for " + guest);
    }
}
