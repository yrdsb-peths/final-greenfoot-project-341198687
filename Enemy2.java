import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the second enemy in the game.
 * 
 * Kushager Bakshi
 * June 17 2024
 */
public class Enemy2 extends Enemy
{
    //The user must hit Enemy2 twice for it to count
    int timesHit = 2;
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveEnemy();
        removeEnemy();
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
            timesHit--;
        }
        else if (getY()==599)
        {
            getWorld().removeObject(this);
        }
        else if (getY()==599)
        {
            getWorld().removeObject(this);
        }
    }
}
