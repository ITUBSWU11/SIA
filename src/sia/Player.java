package sia;

//import
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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
    
    public Player() {
        System.out.println("It's a dark and cruel world...");
        pos_x = 20;
        pos_y = 20;
        directions = new ArrayList<String>();
        directions.add("left");
        directions.add("right");
        items = new ArrayList<Item>();
        upgrades = new HashMap<String, Item>();
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
    public void move(String direction) {
        
    }
    /**
     * Prints items and upgrades had by player.
     * missing: list upgrades
     * @return String with all items and upgrades
     */
    public String getInventory() {
        int i = 0;
        String returnstring = "";
        for(Item item : items) {
            returnstring += "("+i+"): "+item.getName()+" | ";
            i++;
        }
        Set keys = upgrades.keySet();
        /*for(String key : keys) {
            
        }*/
        return returnstring;
    }
    
    public void drop(int item_number) {
        items.remove(item_number);
    }
    public void drop(String upgrade_key) {
        upgrades.remove(upgrade_key);
    }
    public void add(Item item) {
        if(item.isUpgrade()) {
            //do add upgrade
        }
        else {
            if(!items.isEmpty() && items.size() >= 10) {
                System.out.println("Inventory full! Length: "+items.size());
            }
            else {
                items.add(item);
            }
        }
    }
    public int getMoney() {
        return money;
    }
    public void alterMoney(int change) {
        money += change;
    }
    public int getHealth() {
        return health;
    }
    public void alterHealth(int change) {
        health += change;
    }
    public int getDamage() {
        return damage;
    }
    private void setDamage(int change) {
        damage = change;
    }
    
}
