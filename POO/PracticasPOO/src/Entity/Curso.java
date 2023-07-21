package Entity;

import Enums.Turno;
import Utils.Read;
import Utils.Write;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiaPorSemana;
    private Turno turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiaPorSemana, Turno turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiaPorSemana = cantidadDiaPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public Curso() {
    }

    public static String[] cargarAlumnos(){
        String[] aux = new String[5];
        for (int i = 0; i < aux.length; i++){
            Write.withLineBreak("Escriba el nombre del alumno #" + (i+1) + " :");
            aux[i] = Read.text();
        }
        return aux;
    }

    public static Turno seleccionarTurno(){
        boolean valido = false;
        Turno turno = null;
        do{
            String seleccion = Read.text();
            if("tarde".equalsIgnoreCase(seleccion) || "2".equals(seleccion)){
                valido = true;
                turno = Turno.TARDE;
            } else if ("mañana".equalsIgnoreCase(seleccion) || "1".equals(seleccion)) {
                valido = true;
                turno = Turno.MANANA;
            } else {
                Write.withLineBreak("Turno ingresado inválido, intente de nuevo:");
            }
        }while(!valido);
        return turno;
    }

    public static Curso crearCurso(){
        Write.withLineBreak("Escriba el nombre del curso: ");
        String nombre = Read.text();

        Write.withLineBreak("Escriba la cantidad de horas por día del curso: ");
        int dia = Read.integer();

        Write.withLineBreak("Escriba la cantidad de dias por semana del curso: ");
        int semana = Read.integer();

        Write.withLineBreak("Escriba el turno del curso (1.Mañana / 2.Tarde): ");
        Turno turno = seleccionarTurno();

        Write.withLineBreak("Escriba el precio por hora: ");
        double precio = Read.integer();

        Write.withLineBreak("Escriba el nombre de los alumnos: ");
        return new Curso(nombre,dia,semana,turno,precio, cargarAlumnos());
    }

    public void calcularGananciaSemanal(){
        Write.withLineBreak("La ganacia es: " + (cantidadHorasPorDia*precioPorHora*cantidadDiaPorSemana*alumnos.length) + "$");
    }
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiaPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadHorasPorSemana) {
        this.cantidadDiaPorSemana = cantidadHorasPorSemana;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadDiaPorSemana=" + cantidadDiaPorSemana +
                ", turno=" + turno.getValue() +
                ", precioPorHora=" + precioPorHora +
                ", alumnos=" + Arrays.toString(alumnos) +
                '}';
    }
}
