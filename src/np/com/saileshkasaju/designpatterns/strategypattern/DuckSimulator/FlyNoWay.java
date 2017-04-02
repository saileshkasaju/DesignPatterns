/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.com.saileshkasaju.designpatterns.strategypattern.DuckSimulator;

/**
 *
 * @author Edge
 */
public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
