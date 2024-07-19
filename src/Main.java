public class Main {
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

        switcher.switchOn();

    }
}