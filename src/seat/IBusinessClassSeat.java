package seat;

public interface IBusinessClassSeat {
    public String version();

    public void assign(Passenger passenger);

    public void readingLightOff();

    public void readingLightOn();

    public void upRight();

    public void level1();

    public void level2();
}
