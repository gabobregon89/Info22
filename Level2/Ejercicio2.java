package Level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        System.out.println("Lista inicial:");
        mostrar(numeros);
        System.out.println("Agregamos un numero al final:");
        alFin(numeros, 500);
        mostrar(numeros);
        System.out.println("Agregamos un numero al inicio:");
        alInicio(numeros, 1000);
        mostrar(numeros);
    }

    public static void alFin(List<Integer> lista, int elemento) {
        lista.add(elemento);
    }

    public static void alInicio(List<Integer> lista, int elemento) {
        lista.add(0, elemento);
    }

    public static void mostrar(List<Integer> lista) {
        for( Integer numero : lista) {
            System.out.println(numero);
        }
    }
}
