package Iniciando;

public class Empleado {
    
    private String nombre;
    private String apellido;
    private String puesto;

    public Empleado(String nombre, String apellido, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + "-" + this.puesto + "\n";
    }

}
