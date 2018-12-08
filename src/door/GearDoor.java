package door;

public class GearDoor extends Door {

    private GearDoorType type;

    public GearDoor(String ID, GearDoorType typeOfDoor, String brand)
    {
        super(ID, brand);
        type = typeOfDoor;
    }
}
