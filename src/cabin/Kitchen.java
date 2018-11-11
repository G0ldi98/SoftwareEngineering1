package cabin;

import java.util.ArrayList;

public class Kitchen implements IKitchen {
    private String manufacturer;
    private KitchenType kitchenType;
    private String id;
    private ArrayList<Trolley> trolleyList;
    private boolean isLocked;
    private boolean isFilled;
}
