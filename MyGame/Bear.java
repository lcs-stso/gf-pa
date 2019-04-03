import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnAtEdge();
        randomTurn();
        move(5);
        lookForCat();
    }    
    public void lookForCat()
    {
       if (isTouching(Cat.class))
       {
         removeTouching(Cat.class);  
        }
    }
    
 public void turnAtEdge()
   {
        if ( isAtEdge() ) 
        {
         turn(17);
         
        }
        
    }
 public void randomTurn()
   {
           
        if (Greenfoot.getRandomNumber(100)<10)
        {
         turn(Greenfoot.getRandomNumber(90)-45);
            
    }
   }
}

