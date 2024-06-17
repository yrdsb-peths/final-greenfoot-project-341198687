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
    boolean gameOver = false;

    public MyWorld()
    {    
        super(600, 700, 1); 
        prepare();
    }

    public Counter getCounter()
    {
        return counter;
    }

    public void act()
    {
        if (!gameOver) {
            addEnemy1();
            addEnemy2();
        }
    }

    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(120) < 1)
        {
            addObject(new Enemy1(), Greenfoot.getRandomNumber(600), 0);
        }
    }

    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(120) < 1)
        {
            addObject(new Enemy2(), Greenfoot.getRandomNumber(600), 0);
        }
    }

    private void prepare()
    {
        addObject(counter, 100, 50);
        RocketShip rocketShip = new RocketShip();
        addObject(rocketShip, 297, 546);
    }

    public void gameOver()
    {
        gameOver = true;
        Greenfoot.stop();
        showText("Game Over", getWidth() / 2, getHeight() / 2);
    }
}
