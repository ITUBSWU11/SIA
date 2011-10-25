package sia;

/**
 *
 * @author hypesystem
 */
public abstract class Unit {
    protected int pos_x;
    protected int pos_y;
    protected int damage;
    protected int health;
    
    public Unit() {
        pos_x = 0;
        pos_y = 0;
        damage = 0;
        health = 0;
    }
    
    public int getX() {
        return pos_x;
    }
    
    public int getY() {
        return pos_y;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getHealth() {
        return health;
    }
    
    public abstract boolean isAlive();
    
    //public abstract Image getImage();
    
    public void move(int change_x, int change_y) {
        pos_x += change_x;
        pos_y += change_y;
    }
    
}
