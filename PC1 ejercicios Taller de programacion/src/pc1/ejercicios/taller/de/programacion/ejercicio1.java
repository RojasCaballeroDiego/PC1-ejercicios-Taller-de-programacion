/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc1.ejercicios.taller.de.programacion;

/**
 *
 * @author Xabi
 */
import java.util.Scanner;
public class ejercicio1 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //variable
        int h,m,s;
        
        System.out.println("Ingrese la hora (0-23): ");
        h = lector.nextInt();
        
        System.out.println("Ingrese el minuto (0-59): ");
        m = lector.nextInt();
        
        System.out.println("Ingrese el segundo(0-59): ");
        s = lector.nextInt();
        
        if (h >= 0 && h <= 59 && m >= 0 && m <= 59 && s >= 0 && s <=59){
            System.out.printf("La hora original: %02d:%02d:%02d\n",h,m,s);
            
            s++;
            
            if (s==60){
                s=0;
                m++;
            }
            if (m==60){
                m=0;
                h++;
            }
            if (h==24){
                h=0;
            }
            System.out.printf("La hora modificada: %02d:%02d:%02d\n",h,m,s);
        } else {
            System.out.println("error: La hora es invalida");
        }
    }
    
}
