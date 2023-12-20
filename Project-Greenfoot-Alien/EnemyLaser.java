import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyLaser extends Actor
{
    /**
     * Act - do whatever the EnemyLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {// Add your action code here.
        move(-5);
        
        if (isTouching(Herowan.class)){
        touchHerowan();
    }
    else if (isAtEdge()) {
            getWorld().removeObject(this);
        } 
    }
    
    private void touchHerowan(){
        getWorld().addObject(new Boom(), getX(), getY());
        removeTouching(Herowan.class);
        getWorld().removeObject(this);
    }
}
