package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase: ");
        String frase = scan.nextLine();
        System.out.println("Ingresa una letra cualquiera: ");
        String letra = scan.nextLine();
        System.out.println(String.format("La letra %s se repite %d", letra, veces(aMinuscula(frase), letra)));

        scan.close();
    }

    //Funcion que cuenta las veces que se repite una letra que le pasamos como argumento
    public static int veces(String frase, String letra) {
        char una = letra.charAt(0);
        char[] letras = frase.toCharArray();
        int repetida = 0;
        for(int x = 0; x < frase.length(); x++) {
            if (letras[x] == una) {
                repetida += 1;
            }
        }
        return repetida;
    }

    //Funcion que me convierte todas las letras de la frase a minusculas
    //Se hace uso del codigo ASCII para manejar los caracteres
    public static String aMinuscula(String algo) {
        char[] letras = algo.toCharArray();
        for(int x = 0; x < algo.length(); x++) {
            if (letras[x] - 'a' < 0) { //Si la diferencia es negativa, letras[x] es masyuscula
                letras[x] =  (char) (letras[x] + 'a' - 'A'); //La convertimos a minuscula
            }  
        }
        return Arrays.toString(letras);
    }
}
