public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        switcher.consumer = lamp;
        switcher.switchOn();
    }
}