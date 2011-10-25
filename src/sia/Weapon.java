package sia;

/**
 * A weapon
 * @author hypesystem
 */
public class Weapon extends Item {
    static final ItemType type = ItemType.WEAPON;
    
    public Weapon(String name, int price, int health, int damage) {
        super(name, price, health);
        attributes.put("damage", damage);
        attributes.put("durability",100);
    }

    @Override
    public ItemType getItemType() {
        return type;
    }
}