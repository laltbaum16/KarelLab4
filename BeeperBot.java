
import kareltherobot.*; 

/**
 * @author :  L. Altbaum
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
}
    public void runRace() {
    while(frontIsClear()) {
        collectBeeperSteeple();
    }
}
public void findBeepers() {
    faceEast();
    while(!nextToABeeper()) {
        move();
      }
    
}
public void collectBeeperSteeple() {
    findBeepers();
}
public void faceEast() {
    while(!facingEast()) {
        turnLeft();
   }
}