package Level1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        System.out.println(numero1 + " elevado a " + numero2 + " = " + potencia(numero1, numero2));
        
        scan.close();
    }
    //Potencia sin uso de librerias
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for(int i = 0; i < exponente; i++) {
            resultado = resultado * base; 
        }
        return resultado;
    }
}
