package cabin;

public interface IAirConditioning {

    public String version();

    public boolean on();

    public String clean(String airFlow);

    public String heat(String airFlow, int temperature);

    public String cool(String airFlow, int temperature);

    public boolean off();
}
