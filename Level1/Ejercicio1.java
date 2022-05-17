package Level1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        //Solicitamos al usuario que ingrese su nombre
        String nombre = scan.nextLine();
        //Impreme un mensaje con el nombre ingresado anteriormente
        System.out.println("Hola " + nombre + " !!!");
        scan.close();
    }   
}
