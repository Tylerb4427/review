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
public class Dog extends Animal {

    private static int size;

    public Dog(int asize, String name) {
        super("dog", 4);
        size = asize;
        super.setName(name);
    }

    public static void speak() {
        switch (size) {
            case 1:
                System.out.println("bark");
                break;

            case 2:
                System.out.println("bork");
                break;

            case 3:
                System.out.println("woof");
                break;

            default:
                System.out.println("boof");
                break;
        }
    }
    
}
