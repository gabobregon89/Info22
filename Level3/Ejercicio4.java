package Level3;

import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        numeros.stream()
            .distinct() //esta funcion me elimina valores duplicados
            .forEach(n -> System.out.println(factorial(n)));
        
    }
    public static int factorial(int n) {
        int resultado = 1;
        if (n == 0) {
            return resultado;
        } else if (n == 1) {
            return resultado;
        } else {
            return n * factorial(n - 1);
        }
    } 
}
