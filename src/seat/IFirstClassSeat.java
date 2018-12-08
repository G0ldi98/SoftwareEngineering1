package seat;

public interface IFirstClassSeat {
    String version();
    void assign(Passenger passenger);
    void readingLightOff();
    void readingLightOn();
    void level(int lvl);
}
