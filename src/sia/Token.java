package sia;

/**
 * A token.
 * @author hypesystem
 */
public class Token extends Item {
    static final ItemType type = ItemType.HULL;
    
    public Token(String name, int price, int health, int damage, int speed) {
        super(name, price, health);
        attributes.put("damage",damage);
        attributes.put("speed",speed);
    }
    
    @Override
    public ItemType getItemType() {
        return type;
    }
}