import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyOne extends Actor
{
    int deltaX;//Makes X a variable
    int deltaY;//Makes Y a variable
    
    /**
     * 
     */
    public EnemyOne()
    {
      deltaX = 6;//Sets the base speed and direction of the actor
      deltaY = 6;
        
    }
    /**
     * Act - do whatever the EnemyOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX() + deltaX, getY() + deltaY);//Allows the variables to be changed and change the location of the actor
        
        if (isTouching(WallOne.class))//Detects if it is touching a wall
       {
           deltaX = -6;
       }
       
        if (isTouching(WallTwo.class))//Detects if it is touching a wall
       {
           deltaX = +6;
       }
       
      if (isTouching(WallThree.class))//Detects if it is touching a wall
       {
           deltaY = -6;
       }
       
       if (isTouching(WallFour.class))//Detects if it is touching a wall
       {
           deltaY = +6;
       }
    }    
}
