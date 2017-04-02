package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class SwordBehaviour implements WeponBehaviour {

    @Override
    public void useWepon() {
        System.out.println("Using a sword to attack.");
    }
    
}
