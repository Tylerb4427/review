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
public class Animal{
    public String name;
    private String type;
    private int legs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }
    public void eat(){
        System.out.println("Nom Nom Nom");
    }
    public int getLegs(){
        return legs;
    }
    public String getType(){
        return type;
    }
    
    @Override
    public String toString(){
        return name+" the " +type;
    } 
    
}
