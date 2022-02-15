import java.util.ArrayList;

public class Inventory {
    private ArrayList<Phone> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void addPhone(Phone ph) {
        inventory.add(ph);
    }

    public int getNumOfPhones() {
        return inventory.size();
    }

    public double getInventoryValue() {
        double sum = 0;
        for (int i = 0; i < inventory.size(); i++)
        {
            sum = sum + inventory.get(i).getPrice();
        }
        return sum;
    }
}
