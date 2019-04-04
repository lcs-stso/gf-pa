import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Get an object reference to our world 
        ForestWorld world = (ForestWorld) getWorld();
        if(isTouching(Fries.class))
        {

        }

        if(Greenfoot.isKeyDown("left")){
            int x = getX();
            int y = getY();
            setLocation(x-5, y);
        }
        if(Greenfoot.isKeyDown("right")){
            int x = getX();
            int y = getY();
            setLocation(x+5, y);
        }

        if(Greenfoot.isKeyDown("up")){
            int x = getX();
            int y = getY();
            setLocation(x, y-5);
        }
        if(Greenfoot.isKeyDown("down")){
            int x = getX();
            int y = getY();
            setLocation(x, y+5);
        }  

        if ( isTouching(Bear.class) ) 
        {

            Greenfoot.playSound("Meow.wav");
        }    
    }
}