package np.com.saileshkasaju.designpatterns.strategypattern.AdventureGame;

/**
 *
 * @author Edge
 */
public abstract class Character {
    WeponBehaviour weponBehaviour;
    
    public Character() {}
    public void fight() {
        weponBehaviour.useWepon();
    }

    public void setWeponBehaviour(WeponBehaviour weponBehaviour) {
        this.weponBehaviour = weponBehaviour;
    }
    
    
    public abstract void display();
}
