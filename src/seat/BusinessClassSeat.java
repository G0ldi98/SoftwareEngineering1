package seat;

import airplanePart.AirplanePart;
import airplanePart.IAirplanePart;

public class BusinessClassSeat implements IBusinessClassSeat {
    private IAirplanePart buisnessSeat;
    private Passenger passenger;
    private int level;
    private INonSmokingSign nonSmokingSign;
    private ISeatBeltSign seatBeltSign;
    private IReadingLight readingLight;

    @Override
    public String version() {
        return buisnessSeat.version();
    }

    @Override
    public void assign(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void readingLightOff() {
        readingLight.off();
    }

    @Override
    public void readingLightOn() {
        readingLight.on();
    }

    @Override
    public void level(int lvl)
    {
        switch (lvl) {
            default: level = 0;
                break;
            case 0: level = 0;
                break;
            case 1: level = 1;
                break;
            case 2: level = 2;
                break;
    }
}
