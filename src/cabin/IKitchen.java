package cabin;

public interface IKitchen {
    String version();

    void lockKitchen(); // war vorher boolean

    void unlockKitchen(); // war vorher boolean

    double getTotalWeightTrolleys();

    void addTrolley(Trolley trolley);

    void emptyTrolley(Trolley trolley);
}
