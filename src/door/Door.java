package door;

import airplanePart.AirplanePart;

public abstract class Door implements IDoor{

    protected AirplanePart door;
    protected boolean isLocked;
    protected boolean isClosed;

    public Door(String ID, String brand)
    {
        door = new AirplanePart(ID, brand);
        isLocked = false;
        isLocked = true;
    }

    public Door(String ID, String typeOfDoor, String brand)
    {
        door = new AirplanePart(ID, brand, typeOfDoor);
        isClosed = false;
        isClosed = true;
    }

    @Override
    //the version contains id and type
    public String version()
    {
        return door.version();
    }

    @Override
    //Opening the door if it isn´t locked
    public void open()
    {
        if (!isLocked)
            isClosed = false;
    }

    @Override
    //Closing the door
    public void close()
    {
        isClosed = true;
    }

    @Override
    //Closes the door if needed and locks it
    public void lockDoor()
    {
        if(!isClosed)
            close();
        isLocked = true;
    }

    @Override
    //Unlocks the door and remains in the current state of isClosed
    public void unlockDoor()
    {
        isLocked = false;
    }
}
