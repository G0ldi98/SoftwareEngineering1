package cabin;

public interface ILavatory {
    public String version();

    public boolean lock();

    public boolean unlock();

    public boolean clean();
}
