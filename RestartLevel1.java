import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RestartLevel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestartLevel1 extends Actor
{
    /**
     * Act - do whatever the RestartLevel1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))//Checks if start if clicked
        {
            Greenfoot.setWorld(new MyWorld());//Startes the game
            
            Greenfoot.delay(25);//Makes a delay before game start
        }
    }    
}
