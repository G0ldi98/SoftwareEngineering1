package door;

public class EmergencyExitDoor extends Door {

    private boolean isEscapeSlideActivated;

    public EmergencyExitDoor(String ID, String typeOfDoor, String brand)
    {
        super(ID, typeOfDoor, brand);
        isEscapeSlideActivated = false;
    }

    //Activates the EscapeSlide (even if it´s already active)
    public void activateEscapeSlide()
    {
        isEscapeSlideActivated = true;
    }
}
