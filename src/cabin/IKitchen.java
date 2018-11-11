package cabin;

public interface IKitchen {
    public String version();

    public boolean lock();

    public boolean unlock();

    public double getTotalWeightTrolleys();

    public void addTrolley(Trolley trolley);

    public void emptyTrolley(Trolley trolley);
}
