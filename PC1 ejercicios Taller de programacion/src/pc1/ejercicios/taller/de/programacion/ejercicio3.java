/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc1.ejercicios.taller.de.programacion;

/**
 *
 * @author Xabi
 */
//ejercicio3
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //variables:
        double soles, resultado=0;
        int opcion;
        String moneda;
        
        System.out.println("Ingrese la cantidad en soles (PEN) ");
        soles = lector.nextDouble();
        
        System.out.println("Seleccione la moneda de destino: ");
        System.out.println("1: Dolares Americanos(USD)");
        System.out.println("2: Euros(EUR)");
        System.out.println("3: Libras Esterlinas(GBP)");
        System.out.println("4: Pesos Mexicanos(MXN)");
        System.out.println("Opcion elegida: ");
        opcion = lector.nextInt();
        
        switch(opcion){
            case 1:
                resultado = soles * 0.27;
                moneda = "USD";
                break;
            case 2:
                resultado = soles * 0.25;
                moneda = "EUR";
                break;
            case 3:
                resultado = soles * 0.21;
                moneda = "GBP";
                break;
            case 4:
                resultado = soles * 4.50;
                moneda = "MXN";
                break;
            default:
                System.out.println("Moneda invalida");
                return;
        }
        System.out.printf("Resultado %.2f Soles equivalen a %.2f %s",soles,resultado,moneda);
    }

}
