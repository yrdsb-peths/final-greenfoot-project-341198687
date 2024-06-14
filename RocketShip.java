import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RocketShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RocketShip extends Actor
{
    /**
     * Act - do whatever the RocketShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RocketShip()
    {
        setRotation(280);
    }
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
         if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
    }
}
