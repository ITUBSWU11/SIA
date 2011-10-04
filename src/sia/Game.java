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
        Item sword = new Item("Sword of Awesome", 100, 0, 5, false);
        Item skin = new Item("Harness of skin", 12, 1, 0, false);
        Player player = new Player();
        player.add(sword);
        player.add(skin);
        System.out.println(sword.inspect());
        System.out.println(skin.inspect());
        player.drop(0);
        System.out.println("Inventory: "+player.getInventory());
    }
    
}
