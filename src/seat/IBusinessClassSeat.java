package seat;

public interface IBusinessClassSeat {
    String version();
    void assign(Passenger passenger);
    void readingLightOff();
    void readingLightOn();
    void level(int lvl);
}
