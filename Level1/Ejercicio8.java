package Level1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Completa el formulario con tus datos");
        System.out.println("Ingresa tu nombre y apellido: ");
        String nombreApellido = scan.nextLine();
        System.out.println("Ingresa tu edad: ");
        String edad = scan.nextLine();
        System.out.println("Ingresa tu direccion: ");
        String direccion = scan.nextLine();
        System.out.println("Ingresa tu ciudad: ");
        String ciudad = scan.nextLine();

        System.out.println(datos(nombreApellido, edad, direccion, ciudad));
        scan.close();
    }

    public static String datos(String nomAp, String edad, String dir, String ciu) {
        return String.format("%s - %s - %s - %s", ciu, dir, edad, nomAp);
    }
}
