public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        // event subscribe подписка на событие

        class Fire implements ElectricityConsumer {
            @Override
            public void electricityOn() {
                System.out.println("Пожар! В обычном классе!");
            }
        }
        switcher.addElectricityListiner(radio);
        switcher.addElectricityListiner(lamp);
        switcher.addElectricityListiner(new Fire());
        switcher.addElectricityListiner(
                new ElectricityConsumer() {
                    public void electricityOn() {
                        System.out.println("FIRE! В анонимном классе!");
                    }
                });

        switcher.switchOn();

    }
}