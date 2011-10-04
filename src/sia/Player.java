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
    
    public Player() {
        System.out.println("It's a dark and cruel world...");
        pos_x = 20;
        pos_y = 20;
        directions = new ArrayList<String>();
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
    public String getInventory() {
        Set keys = upgrades.keySet();
        for(String key : keys) {
            
        }
    }
    
}
