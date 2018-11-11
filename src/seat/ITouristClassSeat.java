package seat;

public interface ITouristClassSeat {
    public String version();

    public void assign(Passenger passenger);

    public boolean nonSmokingSignOff();

    public boolean nonSmokingSignOn();

    public boolean seatBeltSignOff();

    public boolean seatBeltSignOn();

    public int upRight();

    public int level1();
}
