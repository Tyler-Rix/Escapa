import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardGameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardGameOver extends World
{
    
    /**
     * Constructor for objects of class HardGameOver.
     * 
     */
    public HardGameOver(int score)//Makes time survived into score
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        addObject(new GameOverTitle(), 400 , 100);//Adds gameover writing
        showText("Time Survived: " + score, 400 , 250);//displays score
        addObject(new RestartLevel2(), 250 , 400);//Adds level restart
        addObject(new LevelBack(), 550 , 400);//Adds back to level start
    }
}
