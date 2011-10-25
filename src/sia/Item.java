package sia;

import java.util.HashMap;

/**
 * An item.
 * @author hypesystem
 */
public abstract class Item {
    private String name;
    private double discount_pct;
    protected HashMap<String,Integer> attributes;
    
    public Item(String name, int price, int health) {
        this.name = name;
        attributes.put("price", price);
        attributes.put("heatlh", health);
        discount_pct = 0;
    }
    
    public int getFinalPrice() {
        double final_price = attributes.get("price") - ((attributes.get("price")/100)*discount_pct);
        return (int)final_price;
    }
    
    public void setDiscount(int discount_in_pct) {
        discount_pct = discount_in_pct;
    }
    
    public double getDiscount() {
        return discount_pct;
    }
    
    public HashMap<String,Integer> getAttributes() {
        return attributes;
    }
    
    public abstract ItemType getItemType();
    
}