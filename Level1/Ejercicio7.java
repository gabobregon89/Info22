package Level1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una palabra en minuscula:");
        String palabra = scan.nextLine();

        aMayuscula(palabra);
        scan.close();
    }

    //Funcion que convierte una palabra que esta en minuscula a mayuscula
    public static void aMayuscula(String palabra) {
        char letra;
        for(int x = 0; x < palabra.length(); x++) {
            letra = (char) palabra.charAt(x);
            //verifico si la letra es minuscula para convertirla sino la dejo pasar
            if (letra - 'a' >= 0) {
                letra = (char) (letra - 'a' + 'A');
            }
            System.out.print(letra);
        }
    }
}
