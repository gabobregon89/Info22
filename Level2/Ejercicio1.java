package Level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tus tres ciudades favoritas:");
        ArrayList<String> ciudades = new ArrayList<>();
        String ciudad1 = scan.nextLine();
        String ciudad2 = scan.nextLine();
        String ciudad3 = scan.nextLine();

        cargar(ciudades, ciudad1);
        cargar(ciudades, ciudad2);
        cargar(ciudades, ciudad3);

        mostrar(ciudades);

        scan.close();

    }       
    //Funcion que recibe dos parametros, la lista donde almacenar y los lugares 
    //que se ingresa por teclado
    public static void cargar(ArrayList<String> ciudades, String lugar) {
        ciudades.add(lugar);
    }

    //Funcion que recorre la lista de ciudades y los muestra con un ranking
    public static void mostrar(ArrayList<String> lugares) {
        int posicion = 1;
        for(String lugar : lugares) {
            System.out.println(String.format("#%d - %s", posicion, lugar));
            posicion +=1;
        }
    }
}
