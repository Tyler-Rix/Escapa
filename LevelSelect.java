import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        
        addObject(new EsayLevelPic(), 150 , 200);//Adds level pic
        
        addObject(new Easy(), 150 , 350);//Adds level difficulty
        
        addObject(new HardLevelPic(), 425 , 200);//Adds level pic
        
        addObject(new Hard(), 425 , 350);//Adds level difficulty
    }
}
