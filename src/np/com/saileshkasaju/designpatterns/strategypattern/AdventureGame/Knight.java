package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class Knight extends Character {

    public Knight() {
        this.weponBehaviour = new KnifeBehaviour();
    }

    
    @Override
    public void display() {
        System.out.println("I am the Knight and I like using knives.");
    }    
}
