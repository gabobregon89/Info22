package Streams;

//import java.util.stream.Stream;

public class Practica {
    public static void main(String[] args) {
        /*Stream<Integer> numeros = Stream.iterate(40, n -> n + 2).limit(20);
        numeros.forEach(n -> System.out.println(n));
        //System.out.println(numeros);*/
        String fechaHoy = "2022-06-19";
        String fechaNacimiento = "1989-03-11";


        System.out.println(obtenerEdad(fechaHoy,fechaNacimiento));
        
    }
    public static Integer obtenerEdad(String fechaActual, String fechaNacimiento) {
        String[] sueltos = fechaActual.split("-");
        String[] nacimiento = fechaNacimiento.split("-");
        Integer anioActual = Integer.parseInt(sueltos[0]);
        Integer anioNacio = Integer.parseInt(nacimiento[0]);
        Integer mesActual = Integer.parseInt(sueltos[1]);
        Integer mesNacio = Integer.parseInt(nacimiento[1]);
        Integer diaActual = Integer.parseInt(sueltos[2]);
        Integer diaNacio = Integer.parseInt(nacimiento[2]);
        Integer edad = 0;
        if ((diaActual - diaNacio) < 0) {
            edad = (anioActual - anioNacio) - 1;
        } else if ((mesActual - mesNacio) < 0) {
            edad = (anioActual - anioNacio) - 1;
        } else {
            edad = anioActual - anioNacio;
        }
        return edad;   
    }
    
}
