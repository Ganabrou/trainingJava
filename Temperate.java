/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.function;

/**
 *
 * @author HOANGANH
 */
import java.util.Scanner;
public class Temperate {
        public static void main(String[] args) {
       Scanner scanIn = new Scanner(System.in);
       float C,F;
       System.out.println("Input C: ");
       C = scanIn.nextFloat();
       System.out.println("Convert to F: " + ((1.8*C)+32));

    }

    
}
