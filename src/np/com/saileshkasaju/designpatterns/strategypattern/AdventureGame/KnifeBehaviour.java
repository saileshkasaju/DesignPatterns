package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class KnifeBehaviour implements WeponBehaviour {

    @Override
    public void useWepon() {
        System.out.println("Using a knife to cut through armour.");
    }
    
}
