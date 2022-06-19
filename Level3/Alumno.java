package Level3;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public Alumno() {}

    public Alumno(String nombre, String apellido, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento);
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public LocalDate getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    public String getFullName() {
        return this.apellido + " " + this.nombre;
    }
    public Integer getEdad() {
        LocalDate hoy = LocalDate.now();
        Period diferencia = Period.between(this.fechaDeNacimiento, hoy);
        return diferencia.getYears();
    }
    /*public void setFechaActual(String fecha) {
        String fechaHoy = "2022-06-19";
    }*/
    
    //Metodo que me brinda la edad de la persona de acuerdo a la fecha que definamos como 'fechaHoy'
    public Integer getObtenerEdad() {
        String fechaHoy = "2022-06-19";
        //String fechaHoy = setFechaActual();
        String[] sueltos = fechaHoy.split("-");
        String[] nacimiento = String.valueOf(this.fechaDeNacimiento).split("-");
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
