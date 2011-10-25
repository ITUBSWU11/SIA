package sia;

import java.util.Map;
import java.util.HashMap;

/**
 * A player.
 * @author hypesystem
 */
public class Player extends Unit {
//  private Image image;
    private Map<ItemType,Item> items;
    private int money;
    private boolean alive;
    
    public Player(int pos_x, int pos_y) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        items = new HashMap<ItemType,Item>();
        alive = true;
        damage = 0;
        health = 0;
    }

    public Map<ItemType,Item> getInventory() {
        return items;
    }

    public void dropItem(ItemType type) {
        items.remove(type);
    }

    public void addItem(Item item) {
        if(!items.containsKey(item.getItemType())) {
            items.put(item.getItemType(), item);
        }
        else {
            System.out.println("Already have item of type ."+item.getItemType());
        }
        calcDamage();
    }

    public int getMoney() {
        return money;
    }

    public void alterMoney(int change) {
        money += change;
        if(money <= 0) money = 0;
    }

    public void alterHealth(int change) {
        if(health > 0) {
            health += change;
            if(health <= 0) {
                alive = false;
            }
        }
        else alive = false;
    }
    
    @Override
    public boolean isAlive() {
        return alive;
    }

    private void calcDamage() {
        damage = 0;
        for(Item item : items.values()) {
            if(item.getAttributes().containsKey("damage")) {
                damage += item.getAttributes().get("damage");
            }
        }
    }
    
}
