package Iniciando;

import java.io.BufferedWriter;
import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.Buffer;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class hola_mundo {
    
public static void main(String[] args) {
    
    //Path ruta = Paths.get("alumnos.txt");
    //lectura(ruta);

    List<Empleado> empleados = new ArrayList<>();
    
    empleados.add(new Empleado("Gabriel", "Obregon", "gerente"));
    empleados.add(new Empleado("Marisol", "Escalante", "encargada"));
    empleados.add(new Empleado("Ana", "Obregon", "vendedora"));
    empleados.add(new Empleado("Jose", "Castelli", "arquitecto"));
    empleados.add(new Empleado("Mauricio", "Lima", "obrero"));

    cargar(empleados);
}
//Funcion que permite leer datos de un archivo .txt
/*public static void lectura(Path ruta) {
    try {
        String contenido = Files.readString(ruta);
        System.out.println(contenido);
    } catch (IOException e) {
        e.printStackTrace();
    }*/

//Funcion que permite cargar objetos de un ArrayList a un archivo .txt como Strings
public static void cargar(List<Empleado> datos) {
    try {
        FileWriter archivo = new FileWriter("Iniciando/empleados.txt");
        BufferedWriter bf = new BufferedWriter(archivo);
        for(Empleado empleado : datos) {
            bf.write(empleado.toString());
        }
        bf.close();
    } catch (Exception e) {
        e.printStackTrace();
    }  
}
}
