package door;

public interface IDoor {

    void open();
    void close();
    void lockDoor();
    void unlockDoor();
    String version();
    void setGearDoor(String ID, String brand);
    void setDoor(String ID, String type, String brand);
}
