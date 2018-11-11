package cabin;

public interface IWasteSystem {
    public String version();

    public boolean on();

    public int deposit(String[] waste);

    public boolean off();

    public boolean clean();
}
