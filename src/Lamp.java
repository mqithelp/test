public class Lamp implements ElectricityConsumer {
    private void lampOn() {
        System.out.println("Lamp On");
    }
    @Override
    public void electricityOn() {
        lampOn();
    }
}
