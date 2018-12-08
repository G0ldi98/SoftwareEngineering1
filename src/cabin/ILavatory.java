package cabin;

public interface ILavatory {
    String version();

    void lockDoor(); // war vorher boolean

    void unlockDoor(); // war vorher boolean

    void clean(); // war vorher boolean
}
