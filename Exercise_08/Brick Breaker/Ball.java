import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ball extends Actor
{
    private Integer distFromY = 5;
    private Integer distFromX = 0;
    private Integer count = 0;
    private Player player;
    private World myWorld;
    private Integer bricksCount = 0;
    
    public Ball(Player player, World myWorld){ // constructor to store player and world objects and resize ball
        this.myWorld = myWorld;
        this.player = player;
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    
    public void act(){ // method to intiate all other methods here 
        moveAround();
        bounce();
        bounceOffEdge();
        hitBrick();
        DisplayIsLose();
        DisplayIsWin();
    }
    
    public void moveAround(){ // function to move the ball with variables distFromX and distFromY 
        setLocation(getX() + distFromX, getY() + distFromY);
    }
    
    public void bounce(){ // function to check if ball hits the anything except edges of MyWorld and make it bounce back
        if(isTouching(Player.class) && this.player.getX() > getX() + 50){
            distFromY = -distFromY;
            distFromX -= 6;
        } else if(isTouching(Player.class) && this.player.getX() < getX() - 50){
            distFromY = -distFromY;
            distFromX += 6;
        } else if(isTouching(Player.class) && this.player.getX() > getX() + 40){
            distFromY = -distFromY;
            distFromX -= 5;
        } else if(isTouching(Player.class) && this.player.getX() < getX() - 40){
            distFromY = -distFromY;
            distFromX += 5;
        } else if(isTouching(Player.class) && this.player.getX() > getX() + 30){
            distFromY = -distFromY;
            distFromX -= 4;
        } else if(isTouching(Player.class) && this.player.getX() < getX() - 30){
            distFromY = -distFromY;
            distFromX += 4;
        } else if(isTouching(Player.class) && this.player.getX() > getX() + 20){
            distFromY = -distFromY;
            distFromX -= 3;
        } else if(isTouching(Player.class) && this.player.getX() < getX() - 20){
            distFromY = -distFromY;
            distFromX += 3;
        } else if(isTouching(Player.class) && this.player.getX() > getX() + 10){
            distFromY = -distFromY;
            distFromX -= 2;
        } else if(isTouching(Player.class) && this.player.getX() < getX() - 10){
            distFromY = -distFromY;
            distFromX += 2;
        } else if(isTouching(Player.class) || isTouching(Brick.class)){
            distFromY = -distFromY;
        } 
    }
    
    public void bounceOffEdge(){ // function to check if ball hits the edges of MyWorld and make it bounce back
        if(getX() >= getWorld().getWidth() - 1){
            distFromX = -distFromX;
        }
        
        if(getX() <= 0){
            distFromX = -distFromX;
        }
        
        if(getY() <=  0){
            distFromY = - distFromY;
        }
        
    }
    
    public void hitBrick(){ // function to check if ball hits a brick and remove the same brick
        Actor brick = getOneIntersectingObject(Brick.class);
        
        if(brick != null && brick.getX() > getX() + 30){
            getWorld().removeObject(brick);
            distFromX = -distFromX;
            count++;
        } else if(brick != null && brick.getX() < getX() - 30){
            getWorld().removeObject(brick);
            distFromX = -distFromX;
            count++;
        } else if(brick != null){
            getWorld().removeObject(brick);
            count++;
        }
    }
    
    public void DisplayIsLose(){ // function to see if the ball reaches the height of the MyWorld and display that player has lost
        if(getY() >= getWorld().getHeight() - 1) {
            getWorld().showText("YOU LOSE!!!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
    
    public void getBricksCount(Integer bricksCount){ // function to store count of bricks
        this.bricksCount = bricksCount;
    }
    public void DisplayIsWin(){ // function to see if the player has hit all the blocks and display that they have won
        if(count == bricksCount) {
            getWorld().showText("YOU WIN!!!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
