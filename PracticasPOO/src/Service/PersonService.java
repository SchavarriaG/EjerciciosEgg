package Service;

import Entity.Person;
import Utils.Write;
import Utils.Read;

public class PersonService {
    public Person createPerson(){
        Person personCreated = new Person();
        Write.withLineBreak("Ingrese el nombre de la persona.");
        personCreated.setName(Read.text());
        return personCreated;
    }

    public void getPersonName(Person persona) {
        Write.withLineBreak(persona.getName());
    }
}
