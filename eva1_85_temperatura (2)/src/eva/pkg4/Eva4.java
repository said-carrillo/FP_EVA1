/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva.pkg4;

/**
 *
 * @author invitado
 */
public class Eva4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kelv, far;
        kelv = 100;
        far =  (9 * (kelv - 273.15) / 5) + 32;
        System.out.print("la convercion de kelvin a fahrenheit es:");
        System.out.print(far);
        
    }
    
}
