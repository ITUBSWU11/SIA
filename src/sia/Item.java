package sia;

/**
 * An item.
 * @author hypesystem
 */
public abstract class Item {
    private String name;
    private int price;
    private double discount_pct;
    private int health;
    private int damage;
    private boolean is_upgrade;
    
    public Item(String name, int price, int health, int damage) {
        this.name = name;
        this.price = price;
        this.health = health;
        this.damage = damage;
    }
    
    /**
     * get the name of the item
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Is it an upgrade? Or an item.
     * @return 
     */
    public boolean isUpgrade() {
        return is_upgrade;
    }
    
    /**
     * get price of item
     * @return 
     */
    public int getPrice() {
        double final_price = price - (price/100)*discount_pct;
        return (int)final_price;
    }
    
    /**
     * get health bonus of item
     * @return 
     */
    public int getHealth() {
        return health;
    }
    
    /**
     * get damage bonus of item
     * @return 
     */
    public int getDamage() {
        return damage;
    }
    
    /**
     * set discount (%) of the item
     * @param discount_in_pct 
     */
    public void setDiscount(int discount_in_pct) {
        discount_pct = discount_in_pct;
    }
    
    /**
     * get discount (%) on the item
     * @return 
     */
    public double getDiscount() {
        return discount_pct;
    }
    
    public abstract String getItemType();
    
}
