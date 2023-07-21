package Entity;

public class Person {
    private String name;
    private String lastName;
    private String documentType;
    private String documentNumber;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String setDocumentType(){
        return documentType;
    }
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDocumentType(String documentType){
        this.documentType = documentType;
    }
    public void setDocumentNumber(String documentNumber){
        this.documentNumber = documentNumber;
    }
}
