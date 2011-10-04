package sia;

import java.util.ArrayList;

/**
 * Write a description of class Enemy here.
 * 
 * @author hypesystem
 * @author TheGreenDude
 */
public class Enemy
{
    private int pos_x;
    private int pos_y;
    // private Image image;
    private ArrayList<String> directions;
    private int health;
    private int damage;
    private boolean alive;


    /**
     * Create an enemy. (That is, one enemy per call). 
     * 
     * @param health The health of the enemy. If negative, it will default to 0.
     * @param damage The damage of the enemy. If negative, it will default to 0.
     */
    public Enemy(int health, int damage)
    {
        directions = new ArrayList<String>();
        directions.add("left");
        directions.add("right");
        alive = true;
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

    /**
     * Moves the enemy the defined direction the specified amount
     * @param direction left or right
     * @param amount pixels
     */
    public void move(String direction, int amount) {
        if(directions.contains(direction)) {
            if(direction.equals("left")) {
                pos_x -= amount;
            }
            else if(direction.equals("right")) {
                pos_x += amount;
            }
        }
    }

    /**
     * @return pos_x The current x position of enemy.
     */
    public int getX()
    {
        return pos_x;
    }

    /**
     * @return pos_y The current x position of enemy.
     */
    public int getY()
    {
        return pos_y;
    }
}
