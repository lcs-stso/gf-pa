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
        addObject(theCat,300,250);
        //Create bears in the screen 
        Bear theBear = new Bear();
        addObject(theBear,400,200);
        Bear theBear2 = new Bear();
        addObject(theBear2,200,250);
        Bear theBear3 = new Bear();
        addObject(theBear3,150,50);
        Bear theBear4 = new Bear();
        addObject(theBear4,300,370);
        Bear theBear5 = new Bear();
        addObject(theBear5,150,50);
        
    }

    public void act()
    {
    

    }

}