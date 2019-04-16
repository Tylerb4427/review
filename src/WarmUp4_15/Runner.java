/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmUp4_15;

/**
 *
 * @author bovenzit2681
 */
public class Runner {

    public static void main(String[] args) {
        Dog doggy = new Dog(5, "Spots");
        Dog doge = new Dog(5, "Dogasuaras");

        System.out.println("The animal is a " + doge.getType() + " with " + doge.getLegs() + " legs. Its name is " + doge.getName());
        doge.speak();
        doge.eat();
    }
}
