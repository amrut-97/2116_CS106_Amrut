import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    public Player(){
        getImage().setColor(Color.WHITE); // sets color
        getImage().fillRect(0, 0, 100, 20); // fills it in shape of rectangle
    }
    public void act() // method to allow player to move player's block with right and left keyboard button
    {
        if(Greenfoot.isKeyDown("right")) // can add 'A' key here
            setLocation(getX() + 4, getY());
         if(Greenfoot.isKeyDown("left")) // can add 'D' key here
            setLocation(getX() - 4, getY());
    }
}
