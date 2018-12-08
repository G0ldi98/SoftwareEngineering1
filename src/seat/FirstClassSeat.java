package seat;

import airplanePart.IAirplanePart;

public class FirstClassSeat implements IFirstClassSeat {
    private IAirplanePart firstClassSeat;
    private Passenger passenger;
    private int level;
    private INonSmokingSign nonSmokingSign;
    private ISeatBeltSign seatBeltSign;
    private IReadingLight readingLight;

    @Override
    public String version() {
        return firstClassSeat.version();
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
            case 3: level = 3;
                break;
            case 4: level = 4;
                break;
        }
    }
}
