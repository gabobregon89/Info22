package Level3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        List<Alumno> alumno = List.of(
            new Alumno("Gabriel", "Obregon", "1989-03-11"),
            new Alumno("Juan", "Gomez", "1988-09-03"),
            new Alumno("Maria", "Sanchez", "1990-07-30"),
            new Alumno("Laura", "Martinez", "1994-12-11"),
            new Alumno("Ana", "Obregon", "2017-12-18")
        );
        Map<String, Integer> alumnos = alumno.stream()
            .collect(Collectors.toMap(Alumno::getFullName, Alumno::getObtenerEdad));
        System.out.println(alumnos);

    }
    
}
