package airplanePart;

public class AirplanePart implements IAirplanePart {
    protected String manufacturer;
    protected String id;
    protected String type;

    public AirplanePart(String ID, String brand)
    {
        manufacturer = brand;
        id = ID;
    }

    public AirplanePart(String ID, String brand, String type)
    {
        manufacturer = brand;
        id = ID;
        this.type = type;
    }

    @Override
    public String version()
    {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public String getID()
    {
        return id;
    }
}
