package sia;

//import
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

/**
 * A player instance of Space Invaders Advanced.
 * @author hypesystem
 */
public class Player {
    private int pos_x;
    private int pos_y;
//  private Image image;
    private ArrayList<String> directions;
    private ArrayList<Item> items;
    private HashMap<String, Item> upgrades;
    private int health;
    private int damage;
    private int money;
    private boolean alive;
    
    public Player() {
        System.out.println("It's a dark and cruel world...");
        pos_x = 20;
        pos_y = 20;
        directions = new ArrayList<String>();
        directions.add("left");
        directions.add("right");
        items = new ArrayList<Item>();
        upgrades = new HashMap<String, Item>();
        alive = true;
    }
    
    /**
     * Get the x-coordinate for this player.
     * @return x-coordinate
     */
    public int getX() {
        return pos_x;
    }
    /**
     * Get the y-coordinate for this player.
     * @return y-coordinate
     */
    public int getY() {
        return pos_y;
    }
    
    /**
     * Move left or right by entering the direction.
     * @param direction left or right
     */
    public void move(String direction, int amount) {
        if(directions.contains(direction)) {
            if(direction.equals("left")) {
                pos_x -= amount;
            }
            else if(direction.equals("right")) {
                pos_x += amount;
            }
        }
    }
    /**
     * Prints items and upgrades had by player.
     * missing: list upgrades
     * @return String with all items and upgrades
     */
    public ArrayList<Item> getInventory() {
        ArrayList<Item> inventory = new ArrayList<Item>();
        for(Item item : items) {
            inventory.add(item);
        }
        Collection<Item> upgrades_collection = upgrades.values();
        for(Item upgrade : upgrades_collection) {
            inventory.add(upgrade);
        }
        return inventory;
    }
    
    /**
     * Drop an item
     * @param item_number 
     */
    public void drop(int item_number) {
        items.remove(item_number);
    }
    /**
     * Drop an upgrade
     * @param upgrade_key 
     */
    public void drop(String upgrade_key) {
        upgrades.remove(upgrade_key);
    }
    
    /**
     * Add an item or upgrade
     * missing: should output in some format, not string.
     * @param item 
     */
    public void add(Item item) {
        if(item.isUpgrade()) {
            if(!upgrades.containsValue(item)) {
                upgrades.put(item.getName(), item);
            }
            else {
                //System.out.println("Already have upgrade! Error!");
            }
        }
        else {
            if(!items.isEmpty() && items.size() >= 10) {
                //System.out.println("Inventory full! Length: "+items.size());
            }
            else {
                items.add(item);
            }
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
     * get player health
     * @return 
     */
    public int getHealth() {
        return health;
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
    
    /**
     * get the amount of damage the player does.
     * @return 
     */
    public int getDamage() {
        return damage;
    }
    
    /**
     * Calculate damage form items.
     */
    private void calcDamage() {
        int total_damage = 0;
        for(Item item : items) {
            total_damage += item.getDamage();
        }
        System.out.println("Total damage: "+total_damage);
    }
    
     /**
     * set the amount of damage the player does. done internally.
     * @param change 
     */
    private void setDamage(int change) {
        damage = change;
    }
    
}
