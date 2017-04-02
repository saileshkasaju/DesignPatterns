package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public class AdventureGameSimulator {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.display();
        queen.fight();
        queen.setWeponBehaviour(new KnifeBehaviour());
        queen.fight();
    }
}
