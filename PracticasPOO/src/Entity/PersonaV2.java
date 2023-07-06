package Entity;

import Utils.Read;
import Utils.Write;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.spi.CalendarNameProvider;

import static java.time.temporal.ChronoUnit.YEARS;

public class PersonaV2 {
    private String nombre;
    private Date fechaNacimiento;

    public PersonaV2(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaV2() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static PersonaV2 crearPersona(){
        Write.withLineBreak("Ingresa tu nombre: ");
        String nombre = Read.text();
        Write.withLineBreak("Ingresa tu fecha de nacimiento (dd/mm/yyyy): ");
        String fecha = Read.text();
        String[] cadena = fecha.split("/");
        Date fechaNacimiento = new Date(Integer.parseInt(cadena[2])-1900,
                Integer.parseInt(cadena[1])-1, Integer.parseInt(cadena[0]));
        return new PersonaV2(nombre, fechaNacimiento);
    }

    public int calcularEdad(){
        Date fechaActual = new Date();
        Calendar actual = getCalendar(fechaActual);
        Calendar nacimiento = getCalendar(fechaNacimiento);
        int diff = actual.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

        if(nacimiento.get(Calendar.MONTH) > actual.get(Calendar.MONTH)  ||
                (nacimiento.get(Calendar.MONTH) == actual.get(Calendar.MONTH)
                    && nacimiento.get(Calendar.DATE) > actual.get(Calendar.DATE))){
            diff--;
        }
        //Write.withLineBreak("La edad de "+ nombre + " es " + diff + " años.");
        return diff;
    }

    public static Calendar getCalendar(Date fecha) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(fecha);
        return calendar;
    }

    public boolean menorQue(int edad) {
        boolean menor = (calcularEdad() < edad )?true:false;
        return menor;
    }

    public String mostrarPersona() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return "La persona tiene como nombre " + nombre +
                " y nació el " + formato.format(fechaNacimiento);
    }
}
