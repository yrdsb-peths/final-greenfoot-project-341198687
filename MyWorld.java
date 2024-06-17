import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x700 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addEnemy1();
        }
    }
    public void addEnemy1()
    {
        addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        RocketShip rocketShip = new RocketShip();
        addObject(rocketShip,297,546);
    }
}
