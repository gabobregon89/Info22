package Level3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
                                        "Wonder Woman", "brainiac");
        
        
        long veces = palabras.stream().filter(n -> n.toLowerCase().startsWith("b")).count();
            //con toLowerCase convierto cadad elemento a minuscula y
            //luego con startsWith filtro por aquello elementos que comiencen con "b"
            //y almaceno todo en una variable por count() devuelve un valor de tipo long
        System.out.println(veces);
    }
}
