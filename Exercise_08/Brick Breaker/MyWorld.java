import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private Integer countBricks = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }
    
    public void prepare(){
        
        getBackground().setColor(Color.BLACK); // sets color
        getBackground().fill(); // fills it
        
        Player player = new Player(); // create new Player object
        addObject(player, 300, 550); // at postion x = 300, y = 550
        
        // creating multiple bricks use nested loops
        for(int i = 0; i < 8; i++) {
            // remove commented code to make less bricks and change value of i
            //if(i < 2 || i > 5) // skipping here to create less bricks
            //    continue;
            //else{
                for(int j = 0; j < 4; j++) {
                    // remove commented code to make less bricks and change value of j
                    //if(j < 3) // skipping here to create less bricks
                    //    continue; 
                    //else{ 
                        addObject(new Brick(), 60 + 70 * i, 20 + 30 * j);
                        countBricks++;
                    //}
                }
            //} // closing } for commented else statement inside outside loop
        }
        
        //this.showText(countBricks.toString(), 0, 590); // display count of bricks
        
        Ball ball = new Ball(player, this);
        addObject(ball, 300, 450);
        ball.getBricksCount(countBricks);
     }
}
