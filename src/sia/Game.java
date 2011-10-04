package sia;

/**
 *
 * @author hypesystem
 */
public class Game {
    
    public Game() {
        System.out.println("hello world");
    }
    
    public void play() {
        System.out.println("let the game begin!");
        Item sword = new Item("Sword of Awesome");
        Item laser = new Item("Freaking lazerbeam");
        Player player = new Player();
        player.add(sword);
        player.add(laser);
        System.out.println("Inventory: "+player.getInventory());
        player.drop(0);
        System.out.println("Inventory: "+player.getInventory());
    }
    
}
