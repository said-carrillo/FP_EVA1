/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_20_antro {
    final static String ACCESO_ED = "18";
    final static String ACCESO_CRED = "si";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ed, cre;
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime tu edad");
        ed = captu.nextLine();
        System.out.println("Tienes credencial");
        cre = captu.nextLine();
        if(ed.equals(ACCESO_ED)){
            if(cre.equals(ACCESO_CRED)){
                System.out.println("pasas");
            }else{
                System.out.println("no pasas");
            }
        }else{
            System.out.println("incorrecto");
        }
        
        
        
 
    }
    
}
