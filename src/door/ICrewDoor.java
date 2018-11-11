package door;

public interface ICrewDoor {
    public String version();

    public boolean close();

    public boolean lock();

    public boolean unlock();

    public boolean open();
}
