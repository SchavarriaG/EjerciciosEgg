import Entity.Libro;
import Entity.Person;
import Service.LibroService;
import Service.PersonService;

public class Main {
    public static void main(String[] args) {

        Person persona1 = new Person();
        Person persona2 = new Person("Pedro");

        persona1.setName("Mariana");
        //System.out.println("Hola " + persona1.getName());
        //System.out.println("Hola " + persona2.getName());

        PersonService personService = new PersonService();
        //Person persona3 = personService.createPerson();
        //personService.getPersonName(persona3);

        //Ejercicio 1
        LibroService libroService = new LibroService();
        Libro libro1 = libroService.cargarLibro();
        libroService.verLibro(libro1);

    }
}