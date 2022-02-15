import java.util.ArrayList;

public class Inventory {
    private ArrayList<Phone> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void addPhone(Phone ph) {
        inventory.add(ph);
    }
}
