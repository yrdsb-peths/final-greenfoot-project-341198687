import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the World in which the game is played.It is a galaxy as it is a game
 * in space!
 * 
 * Kushager Bakshi
 * June 17 2024
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
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
    public Counter getCounter()
    {
        //The counter object counts the ammount of enemies the user hits
        return counter;
    }
    public void act()
    {
            //this adds the 2 enemies to the world
            addEnemy1();
            addEnemy2();
    }
    public void addEnemy1()
    {
        //this is adding the first enemy to the world
        if(Greenfoot.getRandomNumber(120)<1)
        {
        addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addEnemy2()
    {
        //this is adding the second enemy to the world
        if(Greenfoot.getRandomNumber(120)<1)
        {
        addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 50);
        RocketShip rocketShip = new RocketShip();
        addObject(rocketShip,297,546);
    }
}
