import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The counter is used to count the ammount of enemies the user hits
 * 
 * Kushager Bakshi
 * June 17 2024
 */
public class Counter extends Actor
{
    int score = 0;
    int targetScore = 15;  // Set the target score to 15

    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score, 50, Color.RED, Color.BLACK));
    }

    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 50, Color.RED, Color.BLACK));
        checkGameOver();
    }

    public void addScore()
    {
        score++;
    }

    public void checkGameOver()
    {
        if (score >= targetScore) {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    }
}
