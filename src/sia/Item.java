package sia;

import java.util.HashMap;

/**
 * An item.
 * @author hypesystem
 */
public class Item {
    private String name;
    private int price;
    private double discount_pct;
    private int health;
    private int damage;
    private boolean is_upgrade;
    
    public Item(String name, int price, int health, int damage, boolean is_upgrade) {
        this.name = name;
        this.price = price;
        this.health = health;
        this.damage = damage;
        this.is_upgrade = is_upgrade;
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
    
    /**
     * Returns HashMap of information with the keys:
     * name, price, discount_pct, health, damage, upgrade
     * @return HashMap of information
     */
    public HashMap inspect() {
        HashMap<String, String> item_information = new HashMap<String, String>();
        item_information.put("name", name);
        String price_str = ""+price;
        item_information.put("price",price_str);
        String discount_str = ""+discount_pct+"%";
        item_information.put("discount_pct",discount_str);
        String health_str = ""+health;
        item_information.put("health",health_str);
        String damage_str = ""+damage;
        item_information.put("damage",damage_str);
        String is_upgrade_str = ""+is_upgrade;
        item_information.put("upgrade",is_upgrade_str);
        return item_information;
    }
    
}
