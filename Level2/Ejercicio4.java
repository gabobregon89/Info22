package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Gabriel");
        alumnos.add("Juan");
        alumnos.add("Julia");
        alumnos.add("Andrea");
        alumnos.add("Maria");
        alumnos.add("Jose");
        alumnos.add("Mauro");
        alumnos.add("German");
        alumnos.add("Pablo");
        alumnos.add("Ana");
        alumnos.add("Marisol");
        alumnos.add("Felipe");

        List<String> curso1 = alumnos.subList(0, 4);
        List<String> curso2 = alumnos.subList(4, 8);
        List<String> curso3 = alumnos.subList(8, 12);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

    }
}
