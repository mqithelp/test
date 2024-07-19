public class Radio implements ElectricityConsumer {
    public void radioOn() {
        System.out.println("Radio On");
    }

    @Override
    public void electricityOn(Object sender) {
        System.out.println("Radio on");
    }
}
