package sia;

/**
 *
 * @author hypesystem
 */
public class Wingset extends Item {
    private double durability;
    private int speed;
    static final ItemType item_type = ItemType.WINGSET;
    
    public Wingset(String name, int price, int health, int damage, int speed) {
        super(name, price, health, damage);
        durability = 1;
        this.speed = speed;
    }
    
    @Override
    public boolean hasDurability() {
        return true;
    }
    
    public double getDurability() {
        return durability;
    }
    
    @Override
    public ItemType getItemType() {
        return item_type;
    }
    
}
