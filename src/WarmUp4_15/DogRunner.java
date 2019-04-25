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
public class DogRunner {

    public static void main(String[] args) {
        Dog doggy = new Dog(5, "Spots");
        Dog doge = new Dog(1, "Dogasuaras");
        //Animal dog = new Animal("dog",4);

        System.out.println("The animal is a " + doggy.getType() + " with " + doggy.getLegs() + " legs. Its name is " + doggy.getName());
        //doggy.speak();
        //doggy.eat();
    }
}
