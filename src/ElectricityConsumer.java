// этот интерфейс мы ииспользуем для связи источника события с потребителями

@FunctionalInterface
public interface ElectricityConsumer {
    public void electricityOn();
}
