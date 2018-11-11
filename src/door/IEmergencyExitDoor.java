package door;

public interface IEmergencyExitDoor {
    public String version();

    public boolean close();

    public boolean lock();

    public boolean unlock();

    public boolean open();

    public boolean activateEscapeSlide();
}
