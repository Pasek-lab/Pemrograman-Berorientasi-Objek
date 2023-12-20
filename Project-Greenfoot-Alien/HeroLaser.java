import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeroLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeroLaser extends Actor
{
    /**
     * Act - do whatever the HeroLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(25);
        if (isTouching(Enemy.class)){
        touchEnemy();
    }
    else if (isAtEdge()) {
            getWorld().removeObject(this);
        } 
    }
    
    private void touchEnemy(){
        getWorld().addObject(new Boom(), getX(), getY());
        removeTouching(Enemy.class);
        getWorld().removeObject(this);
    }
}
