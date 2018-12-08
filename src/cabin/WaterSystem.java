package cabin;

import airplanePart.AirplanePart;

public class WaterSystem implements IWaterSystem {
    private AirplanePart waterSystem;
    private boolean isOn;
    private boolean isFilled;
    private boolean isCleaned;

    public WaterSystem(String ID, String type, String brand)
    {
        waterSystem = new AirplanePart(ID, brand, type);
        isOn = false;
        isFilled = true;
        isCleaned = true;
    }

    @Override
    public String version() {
        return waterSystem.version();
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void refill() {

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
