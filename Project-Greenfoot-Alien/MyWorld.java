import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Herowan herowan = new Herowan();
        addObject(herowan,50,200);
    }
    
    int enemyTimer = 0;
    public void act() {
        if (enemyTimer==120) {
            Enemy enemy1 = new Enemy(Greenfoot.getRandomNumber(5) + 1);
            addObject(
            enemy1,
            590,
            
            Greenfoot.getRandomNumber(300) + 50
            );
            enemyTimer = 0;
        }
        
        enemyTimer++;
    }
}
