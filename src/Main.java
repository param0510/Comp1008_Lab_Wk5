public class Main {
    public static void main(String[] args) {

        //run lines 4 -> 11 to test the phone class
        //be sure to also test that your validation works!
        Phone phone1 = new Phone("Apple", "iPhone 13", 128, 1130.00);
        System.out.printf("phone 1 should display as: Apple-iPhone 13, memory: 128 price: $1130.00%n");
        System.out.printf("%-27s%s%n", "phone 1 displays as:", phone1);

        Phone phone2 = new Phone("Samsung", "Galaxy Z", 256, 2803.75);
        System.out.printf("%nphone 2 should display as: Samsung-Galaxy Z, memory: 256 price: $2803.75%n");
        System.out.printf("%-27s%s%n", "phone 2 displays as:", phone2);

        Phone phone3 = new Phone("Google", "Pixel 6", 128, 936.99);
        System.out.printf("%nphone 3 should display as: Google-Pixel 6, memory: 128 price: $936.99%n");
        System.out.printf("%-27s%s%n", "phone 3 displays as:", phone3);
        //run these lines to test your inventory class
        Inventory inventory = new Inventory();
        inventory.addPhone(phone1);
        inventory.addPhone(phone2);
        inventory.addPhone(phone3);

        System.out.println("\nNumber of phones in the inventory should be: 3");
        System.out.println("Number of phones in the inventory is:        "+inventory.getNumOfPhones());

        System.out.println("\nThe value of the inventory should be: $4870.74");
        System.out.println("The value of the inventory is:        $"+inventory.getInventoryValue());

        Inventory empty = new Inventory();
        System.out.printf("%nAverage price returned if inventory is empty: $0.00%n");
        System.out.printf("Average price returned if inventory is empty: $%.2f%n",empty.getAvgPrice());

        System.out.printf("%nAverage price returned: $1623.58%n");
        System.out.printf("Average price returned: $%.2f%n",inventory.getAvgPrice());

        System.out.println("\nExpected output Inventory.toString(): Number of phones: 3, value of inventory: $4870.74");
        System.out.println("Actual output Inventory.toString():   "+inventory);


        System.out.println("\n~~~~~~~~~~~Bonus~~~~~~~~~");
        System.out.println("The cheapest phone should be: Google-Pixel 6, memory: 128 price: $936.99");
        System.out.printf("The cheapest phone is:        %s%n",inventory.getCheapest());

        System.out.println("\nempty inventory cheapest phone should return: null");
        System.out.println("empty inventory actually returns:             "+empty.getCheapest());
    }
}
