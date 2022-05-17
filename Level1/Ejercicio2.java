package Level1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println("Producto: " + numero1 + " * " + numero2 + " = " + (numero1*numero2));
        System.out.println("Cociente: " + numero1 + " / " + numero2 + " = " + (numero1/numero2));
        System.out.println("Modulo: " + numero1 + " % " + numero2 + " = " + (numero1%numero2)); 
        scan.close();
    }
}
