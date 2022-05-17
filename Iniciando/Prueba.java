package Iniciando;

import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        int numero = scan.nextInt();
        System.out.println("La tabla de multiplicacion del " + numero + " es:");

        for(int x = 1; x <= 10; x++) {
            System.out.println(numero + " * " + x + " = " + (numero * x));
        }
        
        scan.close();
    }

}
