package cabin;

public interface IAirConditioning {

    String version();

    void on(); // war vorher boolean

    String clean(String airFlow);

    String heat(String airFlow, int temperature);

    String cool(String airFlow, int temperature);

    void off(); // war vorher boolean
}
