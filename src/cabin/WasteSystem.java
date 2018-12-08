package cabin;

import airplanePart.AirplanePart;

public class WasteSystem implements IWasteSystem {
    private AirplanePart wasteSystem;
    private String[] waste;
    private boolean isOn;
    private boolean isCleaned;

    public WasteSystem(String ID, String brand, String type)
    {
        wasteSystem = new AirplanePart(ID, brand, type);
        isOn = false;
        isCleaned = true;
    }

    @Override
    public String version() {
        return wasteSystem.version();
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public int deposit(String[] waste) {
        return 0;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public void clean() {
        isCleaned = true;
    }
}
