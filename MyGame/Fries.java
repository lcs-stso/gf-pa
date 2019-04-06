import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fries extends Actor
{
    private int frames = 0; 
    
    
    /**
     * Act - do whatever the Fries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Get an object reference to our world 
        ForestWorld world = (ForestWorld) getWorld();
        frames = frames + 1;
        //After 2 seconds, fries disappear 
        if ((frames % 120) == 0) 
        {
            world.removeObject(this);
        }

    }  
     
}
