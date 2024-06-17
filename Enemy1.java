import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the first enemy in the game
 * 
 * Kushager Bakshi
 * June 17 2024
 */
public class Enemy1 extends Enemy
{
    /**
     * Constructor for objects of class Enemy1.
     */
    public Enemy1()
    {
        setRotation(90);  // Make sure the enemy is facing downwards
    }

    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        hitByProjectile();
    }
    
    public void hitByProjectile()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile !=null)
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if (getY()==599)
        {
            getWorld().removeObject(this);
        }
    }
}
