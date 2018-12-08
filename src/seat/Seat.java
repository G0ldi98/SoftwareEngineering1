package seat;

import airplanePart.AirplanePart;

public abstract class Seat {

    protected AirplanePart seat;
    protected Passenger passenger;
    protected int level;
    protected INonSmokingSign nonSmokingSign;
    protected ISeatBeltSign seatBeltSign;
    protected IReadingLight readingLight;

    public Seat(String ID, String type, String brand, Passenger passenger)
    {
        seat = new AirplanePart(ID, brand, type);
        this.passenger = passenger;
        level = 0;
        nonSmokingSign.off();;
        seatBeltSign.off();
        readingLight.off();
    }

    public Seat(String ID, String brand, String  type)
    {
        seat = new AirplanePart(ID, brand, type);
        level = 0;
        nonSmokingSign.off();
        seatBeltSign.off();
        readingLight.off();
    }

}
