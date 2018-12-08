package cabin;

import airplanePart.AirplanePart;

public class AirConditioning implements IAirConditioning {
    private AirplanePart airConditioning;
    private int temperature;
    private boolean isOn;

    public AirConditioning(String ID, String brand, String type)
    {
        temperature = 21;
        isOn = false;
        airConditioning = new AirplanePart(ID, brand, type);
    }
    @Override
    public String version() {
        return airConditioning.version();
    }

    @Override
    public void on()
    {
        isOn = true;
    }

    @Override
    public String clean(String airFlow) {
        return null;
    }

    @Override
    public String heat(String airFlow, int temperature) {
        return null;
    }

    @Override
    public String cool(String airFlow, int temperature) {
        return null;
    }

    @Override
    public void off() {
        isOn = false;
    }
}
