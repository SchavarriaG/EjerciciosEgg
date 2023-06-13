import Entity.Person;
import Service.PersonService;

public class Main {
    public static void main(String[] args) {

        Person persona1 = new Person();
        Person persona2 = new Person("Pedro");

        persona1.setName("Mariana");
        System.out.println("Hola " + persona1.getName());
        System.out.println("Hola " + persona2.getName());

        PersonService personService = new PersonService();
        Person persona3 = personService.createPerson();
        personService.getPersonName(persona3);
    }
}