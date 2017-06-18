package en03;

/**
 * Created by shouta on 2017/04/24.
 */
public class Item {
    private String name;
    private int price;
    private static int count = 0;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        count += price;
    }

    public static int getPrice() {
        return count;
    }

    public String getProperties() {
        return this.name + ", " + this.price;
    }
}
