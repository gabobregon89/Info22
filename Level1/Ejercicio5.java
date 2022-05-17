package Level1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros:");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        System.out.println(numero1 + " x " + numero2 + " = " + sumasSucesivas(numero1, numero2));
        
        scan.close();
    }
    //Multiplicacion por sumas sucesivas
    public static int sumasSucesivas(int numero, int veces) {
        int resultado = 0;
        for(int i = 0; i < veces; i++) {
            resultado = resultado + numero; 
        }
        return resultado;
    }
    
}
