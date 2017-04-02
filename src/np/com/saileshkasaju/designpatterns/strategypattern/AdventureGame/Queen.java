package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class Queen extends Character {

    public Queen() {
        this.weponBehaviour = new BowAndArrowBehaviour();
    }

    
    @Override
    public void display() {
        System.out.println("I am the Queen and I like using arrows.");
    }    
}
