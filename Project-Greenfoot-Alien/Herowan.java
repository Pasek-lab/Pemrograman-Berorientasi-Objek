import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Herowan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Herowan extends Actor
{
    /**
     * Act - do whatever the Herowan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //move(4);
        if (isAtEdge()){
            setLocation(0, getY());
        }
        herowanMovement();
        shootLaser();
    }
    
    public void herowanMovement() {    
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX()+4, getY()); //50,200
        } else if
        (Greenfoot.isKeyDown("A")){
            setLocation(getX()-4, getY());
        }
        
        if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(),getY()-4);
        } else if
        (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY()+4);
        }
    }
    
    int laserTimer = 0;
    public void shootLaser(){
         if (laserTimer==120) {
            HeroLaser laser = new HeroLaser();
            getWorld().addObject(
                laser,
                getX()+10,
                getY()
            );
            laserTimer = 0;
        }
        
        laserTimer++;
    }
}
