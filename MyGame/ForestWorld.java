import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestWorld extends World
{

    /**
     * Constructor for objects of class ForestWorld.
     * 
     */
    public ForestWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Create a cat in the screen 
        Cat theCat = new Cat();
        this.addObject(theCat,300,250);
        
        
    }
    public void act()
    {
    
    }
}
