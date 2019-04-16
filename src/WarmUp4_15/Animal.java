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
public class Animal {

    private static String type;
    private static int legs;

    public Animal(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }
    public static void eat(){
        System.out.println("Nom Nom Nom");
    }
    public static int getLegs(){
        return legs;
    }
    public static String getType(){
        return type;
    }
}
