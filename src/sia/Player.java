package sia;

//import
import java.util.Map;
import java.util.HashMap;

/**
 * A player instance of Space Invaders Advanced.
 * @author hypesystem
 */
public class Player extends Unit {
//  private Image image;
    private HashMap<String,Item> items;
    private int money;
    private boolean alive;
    
    public Player(int pos_x, int pos_y) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        items = new HashMap<String,Item>();
        alive = true;
        damage = 0;
        health = 0;
    }

    /**
     * Prints items and upgrades had by player.
     * missing: list upgrades
     * @return String with all items and upgrades
     */
    public Map<String,Item> getInventory() {
        return items;
    }
    
    /**
     * Drop an item
     * @param item_number 
     */
    public void drop(String item_type) {
        items.remove(item_type);
    }
    
    /**
     * Add an item
     * missing: should output in some format, not string.
     * @param item 
     */
    public void add(Item item) {
        if(!items.containsKey(item.getItemType())) {
            items.put(item.getItemType(), item);
        }
        else {
            System.out.println("Already have item of type");
        }
        calcDamage();
    }
    
    /**
     * get player money
     * @return 
     */
    public int getMoney() {
        return money;
    }
    
    /**
     * change player money (shop)
     * @param change 
     */
    public void alterMoney(int change) {
        money += change;
    }
    
    /**
     * change player health (damage taken)
     * @param change negative on dmg taken, positive on health potion
     */
    public void alterHealth(int change) {
        health += change;
        if(health <= 0) {
            alive = false;
        }
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    /**
     * Calculate damage form items and sets it for the player.
     */
    private void calcDamage() {
        damage = 0;
        for(Item item : items.values()) {
            damage += item.getDamage();
        }
    }
    
}
