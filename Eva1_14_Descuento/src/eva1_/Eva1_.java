/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        double mon, des;
        System.out.println("Dame el monto de tu compra: ");
        mon = captu.nextDouble();
        if(mon > 1000){
            des = mon * 0.85;
            System.out.println("tu total a pagar es: ");
            System.out.println(des);
        }
    }
}
       
