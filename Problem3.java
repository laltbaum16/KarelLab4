 
import kareltherobot.*; 


/**
 * @author :  L. Altbaum
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
            super(st, av, dir, numBeepers);
        }
        public void closeAllWindows() {
        while(!nextToABeeper()) {
            checkForWindow();
            checkForWalls();
            move();
        }
    }
    public void checkForWindow() {
        turnLeft();    
        if(frontIsClear()) {
                putBeeper();
                turnRight();
            }
            else {
                turnRight();
        }
    }
    public void checkForWalls() {
            if(!frontIsClear()) {
                turnRight();
        }
    }
    public void turnRight() {
            turnLeft();
            turnLeft();
            turnLeft();
    }
}

