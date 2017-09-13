
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
public Problem2(int st, int av, Direction dir, int numBeepers) {
                super(st, av, dir, numBeepers);
}  
public void plantBeepers() {
    while (!nextToABeeper()) {
        checkLocations();
    }
}
        public void checkLocations() {
        while(frontIsClear()) {
        turnLeft();
        while(!frontIsClear()) {
            putBeeper();
            turnRight();
            while(!frontIsClear()) {
                turnRight();
            }
            while(frontIsClear()) {
                move();
                turnLeft();
                if (nextToABeeper()) {
                    turnOff();
                }
            }
        }
    }
}
public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
}
}
