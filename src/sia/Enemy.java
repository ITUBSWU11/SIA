package sia;

/**
 * Write a description of class Enemy here.
 * 
 * @author hypesystem
 * @author TheGreenDude
 */
public class Enemy extends Unit
{
    // private Image image;
    private boolean alive;


    /**
     * Create an enemy. (That is, one enemy per call). 
     * 
     * @param health The health of the enemy. If negative, it will default to 0.
     * @param damage The damage of the enemy. If negative, it will default to 0.
     */
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

    /** 
     * Modifies the enemy's health
     * 
     * @param newHealth Will set the current health of the enemy to newHealth. If negative, it will default to 0. 
     */
    public void alterHealth(int change)
    {
        health += change;
        if(health <= 0) {
            alive = false;
        }
    }

    /** 
     * Modifies the enemy's damage
     * 
     * @param newDamage Will set the current damage of the enemy to newDamage. If negative, it will default to 0. 
     */
    public void setDamage(int newDamage)
    {
        if(newDamage < 0)
        {
                damage = 0;
        }
        else
        {
                damage = newDamage;
        }
    }
    
    @Override
    public boolean isAlive() {
        return alive;
    }
}
