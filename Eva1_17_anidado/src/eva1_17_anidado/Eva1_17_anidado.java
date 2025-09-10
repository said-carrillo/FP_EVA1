/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_17_anidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Numero de dia de la semana");
        dia = captu.nextInt();
        if(dia == 1){
            System.out.println("Domingo");
            
        }else if(dia  == 2){
            System.out.println("lunes");
             }else if(dia  == 3){
            System.out.println("Martes");
             }else if(dia  == 4){
            System.out.println("Miercoles");
             }else if(dia  == 5){
            System.out.println("Jueves");
             }else if(dia  == 6){
            System.out.println("Viernes");
             }else if(dia  == 7){
            System.out.println("Sabado");                
            }else{
                 
             System.out.println("Dia de la semana no valida");
                     } 
}
}