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
public class KennelRunner {
    public static void main(String[] args){
        Kennel newKennel = new Kennel();

        newKennel.addAnimal(new Cat(1,"Mouse"));
        newKennel.addAnimal(new Dog(3,"Spot"));
        //System.out.println(newKennel.print());
        //newKennel.printAnimals();
        System.out.println(newKennel);
    }
}
