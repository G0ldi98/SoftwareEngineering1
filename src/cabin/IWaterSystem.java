package cabin;

public interface IWaterSystem {
    public String version();

    public boolean on();

    public boolean refill();

    public boolean off();

    public boolean clean();
}
