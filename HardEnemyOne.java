import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardEnemyOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardEnemyOne extends Actor
{
    int deltaX;//Makes X a variable
    int deltaY;//Makes Y a variable
    
    /**
     * 
     */
    public HardEnemyOne()
    {
      deltaX = -7;//Sets the base speed and direction of the actor
      deltaY = 7;
        
    }
    /**
     * Act - do whatever the EnemyOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX() + deltaX, getY() + deltaY);//Allows the variables to be changed and change the location of the actor
        
        if (isTouching(WallOne1.class))//Detects if it is touching a wall
       {
           deltaX = -7;
       }
       
        if (isTouching(WallTwo1.class))//Detects if it is touching a wall
       {
           deltaX = +7;
       }
       
      if (isTouching(WallThree1.class))//Detects if it is touching a wall
       {
           deltaY = -7;
       }
       
       if (isTouching(WallFour1.class))//Detects if it is touching a wall
       {
           deltaY = +7;
       }
    }   
}
