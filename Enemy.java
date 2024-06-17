import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
    }

    public void moveEnemy()
    {
        // Example movement code: move down the screen
        setLocation(getX(), getY() + 1);

        // Remove the enemy if it reaches the bottom of the screen
        if (getY() >= getWorld().getHeight())
        {
            getWorld().removeObject(this);
        }
    }
}
