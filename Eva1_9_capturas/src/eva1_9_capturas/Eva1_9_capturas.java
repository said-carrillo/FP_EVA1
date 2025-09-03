/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_capturas;


/**
 *
 * @author invitado
 */
import java.util.Scanner;
public class Eva1_9_capturas {


    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);
        //como capturaren java
        System.out.println("Introduce el nombre completo");
        nombre = input.nextLine(); //nextline --> capturar texto
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        System.out.println("Introduce el promedio");
        promedio = input.nextDouble();  
        System.out.println("El nombre capturado es:");
        System.out.println(nombre);
        System.out.println("Tu edad es:");
        System.out.println(edad);
        System.out.println("Tu promedio es:");
        System.out.println(promedio);
        
        
    }
    
}
