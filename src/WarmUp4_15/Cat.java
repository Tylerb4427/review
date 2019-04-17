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
public  class Cat extends Animal {

    private static int size;

    public Cat(int size, String name) {
        super("cat", 4);
        this.size = size;
        super.setName(name);
    }

    public static void speak() {
                System.out.println("meow");
    }

    
}
