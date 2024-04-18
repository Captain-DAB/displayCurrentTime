/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaytime;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Displaytime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Display time using the modulus and division operator
        
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
        System.out.println(seconds + " seconds is " + minutes
                + " minutes and " + remainingSeconds + " seconds");
    }

}
