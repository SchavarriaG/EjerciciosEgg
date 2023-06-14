import Entity.*;
import Service.LibroService;
import Service.PersonService;
import Utils.Write;

public class Main {
    public static void main(String[] args) {

        //Person persona1 = new Person();
        //Person persona2 = new Person("Pedro");

        //persona1.setName("Mariana");
        //System.out.println("Hola " + persona1.getName());
        //System.out.println("Hola " + persona2.getName());

        //PersonService personService = new PersonService();
        //Person persona3 = personService.createPerson();
        //personService.getPersonName(persona3);

        //Ejercicio 1
        // Creación de objeto por medio del servicio
        /*
        LibroService libroService = new LibroService();
        Libro libro1 = libroService.cargarLibro();
        libroService.verLibro(libro1);

        // Creación de objeto por medio del servicio pero con método estático
        Libro libro2 = LibroService.cargarLibroEstatico();
        LibroService.verLibroEstatico(libro2);

        //Ejercicio 2
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        Write.withLineBreak("El área del círculo es: "  + c1.calcularArea());
        Write.withLineBreak("El perímetro del círculo es: "  + c1.calcularPerimetro());

        //Ejercicio 3
        Operacion operacion1 = Operacion.crerOperacion(); // Math.sqrt()
        Write.withLineBreak("La suma de los números es "  + operacion1.sumar());
        Write.withLineBreak("La resta de los números es "  + operacion1.restar());
        Write.withLineBreak("La multiplicación de los números es "  + operacion1.multiplicar());
        Write.withLineBreak("La división de los números es "  + operacion1.dividir());
        */

        //Ejercicio 4
        Rectangulo rectangulo1 = Rectangulo.crearRectangulo();
        Write.withLineBreak("La superficie del rectángulo es: " + rectangulo1.calcularSuperficie());
        Write.withLineBreak("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());
        rectangulo1.dibujarRectangulo();
    }
}