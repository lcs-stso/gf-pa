import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestWorld extends World
{
    //Track time going up 
    private int frames = 0;
    //Track the score 
    private int score = 0; 
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
        
        // Increment frame (roughly 60 frames per second)
        frames = frames + 1;
        
        
   
        //every 4 seconds,add a fish 
        if ((frames % 240) == 0)
        { 
            Fish myFish = new Fish();
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            addObject(myFish, x, y);
        }

    }

}