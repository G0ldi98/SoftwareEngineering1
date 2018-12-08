package cabin;

import airplanePart.AirplanePart;
import java.util.ArrayList;

public class Kitchen implements IKitchen {
    private AirplanePart kitchen;
    private KitchenType kitchenType;
    private ArrayList<Trolley> trolleyList;
    private boolean isLocked;
    private boolean isFilled;

    public Kitchen(String ID, String brand, KitchenType type)
    {
        kitchen = new AirplanePart(ID, brand);
        kitchenType = type;
        trolleyList = new ArrayList<>();
        isLocked = false;
        isFilled = true;
    }
    @Override
    public String version() {
        return "<" + kitchen.getID() + "> - <" + kitchenType + ">";
    }

    @Override
    public void lockKitchen() {
        isLocked = true;
    }

    @Override
    public void unlockKitchen() {
        isLocked = false;
    }

    @Override
    public double getTotalWeightTrolleys() {
        return 0;
    }

    @Override
    public void addTrolley(Trolley trolley) {
        trolleyList.add(trolley);
    }

    @Override
    public void emptyTrolley(Trolley trolley) {

    }
}
