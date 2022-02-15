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

    public double getAvgPrice() {
        if (inventory.size() == 0) {
            return 0;
        }
        else {
            return (getInventoryValue()/inventory.size());
        }
    }

    @Override
    public String toString() {
        return String.format("Number of phones: " + inventory.size() + ", value of inventory: $" + "%.2f" , getInventoryValue());
    }
}
