package sia;

/**
 * A hull.
 * @author hypesystem
 */
public class Hull extends Item {
    static final ItemType type = ItemType.HULL;
    
    public Hull(String name, int price, int health) {
        super(name, price, health);
        attributes.put("durability",1);
    }
    
    @Override
    public ItemType getItemType() {
        return type;
    }
}
