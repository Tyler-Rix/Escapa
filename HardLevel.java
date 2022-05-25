import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardLevel extends World
{

    /**
     * Constructor for objects of class HardLevel.
     * 
     */
    public HardLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        
        addObject(new PlayerOne(), 400, 250);//Spawns PlayerOne
        
        addObject(new WallOne1(), 780, 250);//Spawns the left wall
        
        addObject(new WallTwo1(), 20, 250);//Spawns the right wall
        
        addObject(new WallThree1(), 400, 480);//Spawns the bottom wall
        
        addObject(new WallFour1(), 420, 20);//Spawns the top wall
        
        addObject(new HardEnemyTwo(), 100 , 100);//Spawns enemy
        
        addObject(new HardEnemyFour(), 100 , 400);//Spawns enemy
        
        addObject(new HardEnemyThree(), 650 , 400);//Spawns enemy
        
        addObject(new HardEnemyOne(), 650 , 100);//Spawns enemy
    }
}
