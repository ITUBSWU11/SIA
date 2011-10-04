package src.sia;


/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy
{
    // instance variables - replace the example below with your own
    private int pos_x;
    private int pos_y;
    // private Image image;
    // private HashMap directions;
    private int health;
    private int damage;
    

    /**
     * Create an enemy. (That is, one enemy per call). 
     * 
     * @param health The health of the enemy. If negative, it will default to 0.
     * @param damage The damage of the enemy. If negative, it will default to 0.
     */
    public Enemy(int health, int damage)
    {
        if(health < 0)
        {
            this.health = 0;
        }
        if(damage < 0)
        {
            this.damage = 0;
        }
        if(health >= 0 && damage >= 0)
        {
            this.health = health;
            this.damage = damage;
        }
    }

    /** 
     * Modifies the enemy's health
     * 
     * @param newHealth Will set the current health of the enemy to newHealth. If negative, it will default to 0. 
     */
    public void setHealth(int newHealth)
    {
        if(newHealth < 0)
        {
            health = 0;
        }
        else
        {
            health = newHealth;
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
    
    /** 
     * @return health The current health of the enemy.
     */
    public int getHealth()
    {
        return health;
    }
    
    /** 
     * @return damage The current damage of the enemy.
     */
    public int getDamage()
    {
        return damage;
    }
}
