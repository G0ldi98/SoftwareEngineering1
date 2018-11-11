package seat;

public interface IFirstClassSeat {
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

    public int level3();

    public int flat();
}
