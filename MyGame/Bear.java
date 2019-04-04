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
        move(4);
        randomTurn();
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
        if (Greenfoot.getRandomNumber(100) >90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
}

