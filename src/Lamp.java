public class Lamp implements ElectricityConsumer {
    // лампа является потребителем электричества и значит реализует интерфейс "Потребитель электричества"
    // т.е. её можно включить "включателем"
    private void lampOn() {
        System.out.println("Lamp On");
    }
    @Override
    public void electricityOn() {
        lampOn();
    }
}
