package sia;

import java.util.HashMap;

/**
 *
 * @author hypesystem
 */
public class Wingset extends Item {
    static final ItemType item_type = ItemType.WINGSET;
    
    public Wingset(String name, int price, int health, int speed) {
        super(name, price, health);
        attributes.put("speed", speed);
        attributes.put("durability",1);
    }
    
    @Override
    public ItemType getItemType() {
        return item_type;
    }
    
}