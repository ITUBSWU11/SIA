package sia;

/**
 * An enemy.
 * @author hypesystem
 * @author TheGreenDude
 */
public class Enemy extends Unit
{
    // private Image image;
    private boolean alive;

    public Enemy(int health, int damage, int pos_x, int pos_y)
    {
        alive = true;

        if(health < 0) this.health = 0;
        else this.health = health;
        
        if(damage < 0) this.damage = 0;
        else this.damage = damage;
        
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    public void alterHealth(int change)
    {
        health += change;
        if(health <= 0) {
            alive = false;
        }
    }

    public void setDamage(int damage)
    {
        if(damage < 0) this.damage = 0;
        else this.damage = damage;
    }
    
    @Override
    public boolean isAlive() {
        return alive;
    }
}