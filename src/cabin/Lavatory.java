package cabin;

import airplanePart.AirplanePart;

public class Lavatory implements ILavatory {
    private AirplanePart lavatory;
    private boolean isLocked;
    private boolean isCleaned;

    public Lavatory(String ID, String brand, String type)
    {
        lavatory = new AirplanePart(ID, brand, type);
        isLocked = false;
        isCleaned = true;
    }

    @Override
    public String version() {
        return lavatory.version();
    }

    @Override
    public void lockDoor() {
        isLocked = true;
    }

    @Override
    public void unlockDoor() {
        isLocked = false;
    }

    @Override
    public void clean() {
        isCleaned = true;
    }
}
