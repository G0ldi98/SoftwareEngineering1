package seat;

import airplanePart.IAirplanePart;

public abstract class Seat implements ISeat {

    protected IAirplanePart seat;
    protected Passenger passenger;
    protected int level;
    protected INonSmokingSign nonSmokingSign;
    protected ISeatBeltSign seatBeltSign;
    protected IReadingLight readingLight;

    public Seat(String ID, String type, String brand, Passenger passenger)
    {
        seat.setAll(ID, type, brand);
        this.passenger = passenger;
        level = 0;
        nonSmokingSign.off();;
        seatBeltSign.off();
        readingLight.off();
    }

    public Seat(String ID, String brand, String  type)
    {
        seat.setAll(ID, brand, type);
        level = 0;
        nonSmokingSign.off();
        seatBeltSign.off();
        readingLight.off();
    }

    @Override
    public String version()
    {
        return seat.version();
    }

}
