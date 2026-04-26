/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc1.ejercicios.taller.de.programacion;

/**
 *
 * @author Xabi
 */
//ejercicio2
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        //variables:
        double pension,promedio,descuento=0,montoDescuento,total;
        int contado;
        
        System.out.println("ingrese la pension base: ");
        pension = lector.nextDouble();
        
        System.out.println("Ingrese el promedio ponderado: ");
        promedio = lector.nextDouble();
        
        System.out.println("¿Pagara al contado? (1: Si / 2: No): ");
        contado = lector.nextInt();
        
        if (promedio >= 18){
            descuento = 0.20;
        } else if (promedio >= 15){
            descuento = 0.10;
        } else if (promedio >= 13){
            descuento = 0.05;
        } else {
            descuento = 0;
        }
        
        montoDescuento = pension * descuento;
        
        //Ternario
        double bono = (contado == 1)? 50:0;
        
        total = pension - montoDescuento - bono;
        
        System.out.println("---DESGLOCE DE MATRICULA---");
        System.out.printf("Pension base: s/ %.2f\n",pension);
        System.out.printf("Descuento por promedio(%.0f%%): %.2f\n",descuento * 100,montoDescuento);
        System.out.printf("Bono pago al contado: s/ %.2f\n", bono);
        System.out.printf("Monto final a pagar: s/ %.2f\n",total);
        System.out.println("---------------------------");
    }

}
