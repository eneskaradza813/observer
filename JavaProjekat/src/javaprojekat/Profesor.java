package javaprojekat;

public class Profesor extends Person {

    public String className;
    
    public Profesor(String firstName, String lastName, String className)
    {
        super(firstName, lastName);
        this.className = className;
        
    }

    @Override
    public String toString() {
        return "Profesor: " + firstName + " " + lastName + " teaches: " + className;
    }

    @Override
    public String getLastName() {
       return lastName;
    }
    
    
    
    
}
