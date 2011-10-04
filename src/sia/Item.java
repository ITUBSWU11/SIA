package sia;

/**
 * Items
 * @author hypesystem
 */
public class Item {
    private String name;
    private int price;
    private int discount_pct;
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
    
    public String getName() {
        return name;
    }
    public boolean isUpgrade() {
        return is_upgrade;
    }
    public int getPrice() {
        int final_price = price - (price/100)*discount_pct;
        return final_price;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDiscount(int discount_in_pct) {
        discount_pct = discount_in_pct;
    }
    
    public String inspect() {
        String state_upgrade = "";
        if(isUpgrade()) {
            state_upgrade = "Upgrade";
        }
        else {
            state_upgrade = "Item";
        }
        return "=="+getName()+"==\n -"+state_upgrade+"-\nPrice: "+getPrice()+"\nHealth+: "+getHealth()+"\nDamage+: "+getDamage();
    }
    
}
