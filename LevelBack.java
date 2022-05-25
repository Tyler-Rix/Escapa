import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelBack extends Actor
{
    /**
     * Act - do whatever the LevelBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this))//Checks if start if cclicked
        {
            Greenfoot.setWorld(new LevelSelect());//Startes the game
            
            Greenfoot.delay(25);//Makes a delay before game start
        }
    }    
}
