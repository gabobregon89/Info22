package Level1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        int numero = scan.nextInt();
        System.out.println("Escalera:");
        for(int x = 1; x <= numero; x++) {
            for(int y = 1; y <= x; y++) {  
                System.out.print(y);              
            }
            System.out.println();
        }
        scan.close();
    }
}
