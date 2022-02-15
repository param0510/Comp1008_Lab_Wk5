import java.util.Arrays;
import java.util.List;

public class Phone {
    private String make, model;
    private int memory;
    private double price;

    public Phone(String make, String model, int memory, double price) {
        setMake(make);
        setModel(model);
        setMemory(memory);
        setPrice(price);
    }

    public void setModel(String model) {
        if (make.length() >= 3) {
            this.model = model;
        }else{
            throw new IllegalArgumentException(model + " is not a valid model name, as it is less than 3 characters long!");
        }

    }

    public void setPrice(double price) {
        if (price >= 0 && price <= 3000) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException(price + " is not valid price as it does not belong in the range 0 to 3000.");
        }
    }

    public static List<String> getValidMakes() {
        return Arrays.asList("Apple", "HTC", "Samsung","Google","Moto");
    }

    public void setMake(String make) {
        if (getValidMakes().contains(make)) {
            this.make = make;
        }
        else{
            throw new IllegalArgumentException(make + " is not a valid make as it does not belong to any one of " + getValidMakes());
        }
    }

    public void setMemory(int memory) {
        if (memory >= 4 && memory <= 512) {
            this.memory = memory;
        }
        else {
            throw new IllegalArgumentException(memory + " is not a valid memory value as it does fall under the range of 4 to 512");
        }
    }

    @Override
    public String toString() {
        return String.format(make+"-"+model + ", memory: " + memory + " price: $" + "%.2f",price);
    }
}
