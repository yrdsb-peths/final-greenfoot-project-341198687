import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the projectile coming out of the RocketShip, it is used to shoot the
 * Enemy
 * 
 * Kushager Bakshi
 * June 17 2024
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        projectileMove();
        removeFromWorld();
    }
    public void projectileMove()
    {
        setLocation(getX(),getY() - 5);
    }
    public void removeFromWorld()
    {
        if (getY()==0)
        {
            getWorld().removeObject(this);
        }
    }
}
