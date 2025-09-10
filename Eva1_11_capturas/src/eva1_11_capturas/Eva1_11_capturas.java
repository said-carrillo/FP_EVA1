/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_capturas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_11_capturas {
    private static int km;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double D, V, T, v;
        
        System.out.println("Distancia de desplazamiento en mts:");
        D = input.nextDouble();
        System.out.println("Tiempo en s:");
        T = input.nextDouble();
        V = D / T;
        System.out.print("La velocidad en (m/s) es:");
        System.out.println(V);
        v = V * 3.6;
        System.out.print("La velocidad en (Kmh) es:");
        System.out.println(v);
       
        
    }
    
}
