import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the title screen which tells the user how to play the game.
 * 
 * @Kushager Bakshi
 * @June 7 2024
 */
public class TitleScreen extends World
{
    Label titleLabel;

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x700 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);

        // Initialize titleLabel with an appropriate label
        titleLabel = new Label("Space Hunt", 60);

        // Add titleLabel to the world at the center
        addObject(titleLabel, getWidth() / 2, getHeight() / 2 - 100);
        
        prepare();
    }
    
    public void act()
    {
        // Starts the game if the space bar is pressed
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RocketShip rocketShip1 = new RocketShip();
        addObject(rocketShip1, 518, 82);
        RocketShip rocketShip2 = new RocketShip();
        addObject(rocketShip2, 88, 86);

        Label startLabel = new Label("To start press <space>", 30);
        addObject(startLabel, getWidth() / 2, getHeight() / 2);

        Label shootLabel = new Label("To shoot enemies press <space>", 30);
        addObject(shootLabel, getWidth() / 2, getHeight() / 2 + 50);

        Label saveLabel = new Label("You are in charge of saving space", 30);
        addObject(saveLabel, getWidth() / 2, getHeight() / 2 + 100);

        Label dontLetUsDownLabel = new Label("DONT LET US DOWN!", 30);
        addObject(dontLetUsDownLabel, getWidth() / 2, getHeight() / 2 + 150);
    }
}
