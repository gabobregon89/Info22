package Level1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        int numero = scan.nextInt();

        //Factorial de un numero
        int resultado = 1; 
        for(int x = 1; x <= numero; x++) {
            resultado = resultado * x;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
        scan.close();
    }
}
