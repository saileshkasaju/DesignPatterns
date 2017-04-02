package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class Troll extends Character {

    public Troll() {
        this.weponBehaviour = new AxeBehaviour();
    }

    
    @Override
    public void display() {
        System.out.println("I am the Troll and I like using my axe.");
    }    
}
