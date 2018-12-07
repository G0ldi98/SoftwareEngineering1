package door;

public interface IEmergencyExitDoor {
    public String version();

    public void close(); // war vorher boolean

    public void lock(); // war vorher boolean

    public void unlock(); // war vorher boolean

    public void open(); // war vorher boolean

    public void activateEscapeSlide(); // war vorher boolean
}
