/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author Jin
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String name = "";
        int choice = -1;
        while (choice < 4) {
            System.out.print("Please input your choice (1,2,3)");
            choice = sc.nextInt();

            if (choice == 1) {
                name = "Benson Hu";
            } else if (choice == 2) {
                name = "Zheng Huang";
            } else if (choice == 3) {
                name = "Benson Hu, Zheng Huang";
            }
            if (choice < 4) {
                System.out.println("Hello World " + name + "!");
            }
        }
        System.out.println("Program exits! ");
    }
}
