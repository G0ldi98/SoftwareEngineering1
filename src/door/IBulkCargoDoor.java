package door;

public interface IBulkCargoDoor {
    public String version();

    public boolean close();

    public boolean lock();

    public boolean unlock();

    public boolean open();
}
