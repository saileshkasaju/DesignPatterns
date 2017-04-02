package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class King extends Character {

    public King() {
        this.weponBehaviour = new SwordBehaviour();
    }

    
    @Override
    public void display() {
        System.out.println("I am the King and I like using a sword.");
    }    
}
