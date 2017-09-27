/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author rskob
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        hiFriends("Bilbo");
    }
    
    public static void hiFriends(String a){
        System.out.println("Welcome to the shire " + a);
    }
    
    
}
