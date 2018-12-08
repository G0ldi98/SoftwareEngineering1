package seat;

import airplanePart.IAirplanePart;

public class CrewSeat implements ICrewSeat {
    private IAirplanePart crewSeat;
    private IReadingLight readingLight;

    @Override
    public String version() {
        return crewSeat.version();
    }

    @Override
    public void readingLightOff() {
        readingLight.off();
    }

    @Override
    public void readingLightOn() {
        readingLight.on();
    }
}