package sia;

/**
 * An engine.
 * @author hypesystem
 */
public class Engine extends Item {
    static final ItemType item_type =  ItemType.ENGINE;
    
    public Engine(String name, int price, int health, int speed) {
        super(name, price, health);
        attributes.put("durability",1);
        attributes.put("speed",speed);
    }
    
    @Override
    public ItemType getItemType() {
        return item_type;
    }
    
}