import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListiner(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListiner(ElectricityConsumer listener) {
        listeners.remove(listener);
    }


    public void switchOn() {
        System.out.println("Switch On");
        for (ElectricityConsumer c : listeners) {
            c.electricityOn();
        }
    }
}
