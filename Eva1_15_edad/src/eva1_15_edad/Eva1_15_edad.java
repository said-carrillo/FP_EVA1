/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_edad;

import java.util.Scanner;

/**
 *
 * @author soid
 */
public class Eva1_15_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner captu = new Scanner(System.in);
        Double anno, eda;
        System.out.println("dime tu año de nacimiento");
        anno =  captu.nextDouble();
        eda = anno - 2025;
        if( eda >= 18){
            System.out.println("puedes votar");
            
            
        }else{
            System.out.println("no puedes votar");
            
     
        
    }
    }
    
}
