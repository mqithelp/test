public class Switcher {
    ElectricityConsumer consumer;

    public void switchOn() {
        System.out.println("Switch On");
        if (consumer != null) {
            consumer.electricityOn();
        }
    }
}
