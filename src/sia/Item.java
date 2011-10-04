package sia;

/**
 * Items
 * @author hypesystem
 */
public class Item {
    private String name;
    private int price;
    private int discountPct;
    private int health;
    private int damage;
    private boolean is_upgrade;
    
    public Item(String name) {
        this.name = name;
        System.out.println("hej");
        is_upgrade = false;
    }
    
    public String getName() {
        return name;
    }
    public boolean isUpgrade() {
        return is_upgrade;
    }
    
    public String inspect() {
        return "Item information";
    }
    
}
