import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The counter is used to count the ammount of enemies the user hits
 * 
 * Kushager Bakshi
 * June 17 2024
 */
public class Counter extends Actor
{
    //this is the starting score 
    int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter()
    {
        setImage (new GreenfootImage("Score: " + score, 50, Color.RED, Color.BLACK));
    }
    public void act()
    {
        setImage (new GreenfootImage("Score: " + score , 50, Color.RED, Color.BLACK));
    }
    public void addScore()
    {
        score++;
    }
}
