public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        // event subscribe подписка на событие
        switcher.addElectricityListiner(radio);
        switcher.addElectricityListiner(lamp);
        switcher.switchOn();
    }
}