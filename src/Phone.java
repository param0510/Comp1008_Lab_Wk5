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
}
