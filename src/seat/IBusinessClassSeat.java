package seat;

public interface IBusinessClassSeat {
    public String version();

    public void assign(Passenger passenger);

    public boolean nonSmokingSignOff();

    public boolean nonSmokingSignOn();

    public boolean seatBeltSignOff();

    public boolean seatBeltSignOn();

    public boolean readingLightOff();

    public boolean readingLightOn();

    public int upRight();

    public int level1();

    public int level2();
}
