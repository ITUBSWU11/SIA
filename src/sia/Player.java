package src.sia;

//import
import java.util.ArrayList;

/**
 * A player instance of Space Invaders Advanced.
 * @author hypesystem
 */
public class Player {
    private int pos_x;
    private int pos_y;
//  private Image image;
//  private HashMap directions;
    private ArrayList<Item> inventory;
    
    public Player() {
        System.out.println("It's a dark and cruel world...");
        pos_x = 20;
        pos_y = 20;
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
    
}
