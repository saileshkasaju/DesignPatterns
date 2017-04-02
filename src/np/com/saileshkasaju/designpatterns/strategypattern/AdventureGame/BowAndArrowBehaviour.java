package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class BowAndArrowBehaviour implements WeponBehaviour {

    @Override
    public void useWepon() {
        System.out.println("Using a bow and arrows to attack.");
    }
    
}
