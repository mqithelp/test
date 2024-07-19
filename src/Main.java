public class Main {
    public static void fire(Object sender) {
        System.out.println("Вызов из обчного статического метода.");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        // event subscribe подписка на событие

        class Fire implements ElectricityConsumer {
            @Override
            public void electricityOn(Object sender) {
                System.out.println("Пожар! В обычном классе!");
            }
        }
        switcher.addElectricityListiner(radio);
        switcher.addElectricityListiner(lamp);
        switcher.addElectricityListiner(new Fire());
        switcher.addElectricityListiner(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn(Object sender) {
                        System.out.println("Fire! Анонимный класс!");
                    }
                }
        );
        switcher.addElectricityListiner(
                sender -> System.out.println("FIRE! В лямбда-выражении!")
        );
        switcher.addElectricityListiner(sender -> Main.fire(sender));
        switcher.addElectricityListiner(Main::fire);
        switcher.switchOn();

    }
}