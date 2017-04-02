package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class AxeBehaviour implements WeponBehaviour {

    @Override
    public void useWepon() {
        System.out.println("Using an axe to attack.");
    }
    
}
