//Assignment # 10 Question 2

public class RetailItem {
	private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDescription() {
        return description;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }
    


    public static void main(String[] args) {
 
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);


        displayItemData("Item #1", item1);
        displayItemData("Item #2", item2);
        displayItemData("Item #3", item3);
    }

    public static void displayItemData(String itemName, RetailItem item) {
        System.out.println(itemName + ":\n" +
                "Description: " + item.getDescription() + "\n" +
                "Units on Hand: " + item.getUnitsOnHand() + "\n" +
                "Price: $" + item.getPrice());
        System.out.println();
    }
}
