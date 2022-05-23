package Level2;

public class Empleado6 {
    
    private String nombreApellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    public Empleado6(String nombreApellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this. valorPorHora = valorPorHora;
    }

    public int getDni() {
        return this.dni;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public int getValorPorHora() {
        return this.valorPorHora;
    }

    public int sueldo(int horas, int valor) {
        return this.horasTrabajadas * this.valorPorHora;
    }

    @Override
    public String toString() {
        return this.nombreApellido + "-" +
               this.dni;
    }
}
