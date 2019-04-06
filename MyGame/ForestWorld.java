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
    private int Score = 0; 
    //Track Fish Eaten 
    private int FishEaten = 0; 
    //Track Fries Eaten 
    private int FriesEaten= 0; 
    //Track Bear Touched 
    private int BearTouched =0; 
    
    private boolean gameOn; 
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
        addObject(theBear,10,200);
        Bear theBear2 = new Bear();
        addObject(theBear2,500,250);
        Bear theBear3 = new Bear();
        addObject(theBear3,100,50);
        Bear theBear4 = new Bear();
        addObject(theBear4,30,370);
        Bear theBear5 = new Bear();
        addObject(theBear5,200,50);

        // Set the initial score
        String currentScore = "Score: 0";
        showText(currentScore, 500, 50);
    }

    public void act()
    {

        if ((frames % 60) == 0)
        {
            String timeElapsed = "Time: " + Integer.toString(frames / 60);
            showText(timeElapsed, 100, 50);
        }
        // Increment frame (roughly 60 frames per second)
        frames = frames + 1;

        //every 2 seconds,add Fries
        if ((frames % 120) == 0)
        { 
            Fries myFries = new Fries();
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            addObject(myFries, x, y);
        }

        //every 4 seconds,add a fish 
        if ((frames % 240) == 0)
        { 
            Fish myFish = new Fish();
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            addObject(myFish, x, y);
        }

        // After 60 seconds, end the game 
        if (frames == 3600 )
        {          
            Greenfoot.stop();  
            String GameEnd = "GameOver";
            showText(GameEnd, 300, 200);
        }
      
    }
    //Add to fish eaten 
    void FishEaten()
    {
        Score = Score +50;
        //Update the score 
        String currentScore = "Score: " + Integer.toString(Score);
        showText(currentScore, 500, 50); 
    }
    //Add to fries eaten 
    void FriesEaten()
    {
        Score = Score - 30;
        //Update the score 
        String currentScore = "Score: " + Integer.toString(Score);
        showText(currentScore, 500, 50); 
    }
    //Add to BearTouched 
    void BearTouched()
    {
        Score = Score - 5;
        //Update the score 
        String currentScore = "Score: " + Integer.toString(Score);
        showText(currentScore, 500, 50); 
    }
    
    
}