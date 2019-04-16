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
    private static String name;

    public Cat(int size, String name) {
        super("cat", 4);
        this.size = size;
        this.name = name;
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
    
    public static String getName(){
        return name;
    }
    
}
