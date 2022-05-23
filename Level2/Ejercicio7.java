package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println(fizzBuzzFuncion(1, 8));
    }

    public static List<String> fizzBuzzFuncion(int inicio, int fin) {
        List<String> conjunto = new ArrayList<>();
        for (int x = inicio; x < fin; x++) {
            if (x % 2 == 0 && x % 3 == 0) {
                conjunto.add("FizzBuzz");
            } else if (x % 2 == 0) {
                conjunto.add("Fizz");
            } else if (x % 3 == 0) {
                conjunto.add("Buzz");
            } else {
                conjunto.add(String.valueOf(x));
            }
        }
        return conjunto;
    }
}
