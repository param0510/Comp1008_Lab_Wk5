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
}
