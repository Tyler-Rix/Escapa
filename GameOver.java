import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int score)//Makes time survived into score
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        addObject(new GameOverTitle(), 400 , 100);//Adds gameover writing
        showText("Time Survived: " + score, 400 , 250);//displays score
        addObject(new RestartLevel1(), 250 , 400);//Adds restart button
        addObject(new LevelBack(), 550 , 400);//Adds back to level select
    }
}
