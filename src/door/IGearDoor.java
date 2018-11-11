package door;

public interface IGearDoor {
    public String version();

    public GearDoorType setGearDoorType(String type);

    public boolean close();

    public boolean lock();

    public boolean unlock();

    public boolean open();
}
