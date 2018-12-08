package cabin;

import airplanePart.AirplanePart;

public class EscapeSlide implements IEscapeSlide {
    private AirplanePart slide;
    private boolean isActivated;

    public EscapeSlide(String ID, String brand, String type)
    {
        slide = new AirplanePart(ID, brand, type);
        isActivated = false;
    }

    @Override
    public String version() {
        return slide.version();
    }

    @Override
    public void activate() {
        isActivated = true;
    }

    @Override
    public void test() {
        isActivated = true;
        isActivated = false;
    }
}
