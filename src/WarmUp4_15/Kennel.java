/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WarmUp4_15;

import java.util.ArrayList;

/**
 *
 * @author bovenzit2681
 */
public class Kennel {

    private static ArrayList<Animal> kennel;

    public Kennel() {
        kennel = new ArrayList<Animal>();
    }

    public static void addAnimal(Animal animal) {
        kennel.add(animal);
    }
    
    public static void printAnimals(){
        System.out.print("\nKennel Contains: ");
        for(Animal i: kennel){
            System.out.print(kennel.get(0).getName()+" the "+kennel.get(0).getType()+", ");
        }
    }
    
    public static String print(){
        return kennel.toString();
    }
    
    public String toString(){
        String ans ="";
        for(Animal i: kennel)
            ans+=i+" ";
        return ans;
    }
}
