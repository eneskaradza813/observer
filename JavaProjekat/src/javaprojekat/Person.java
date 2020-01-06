package javaprojekat;

public abstract  class Person {
    
    public String firstName;
    public String lastName;
    
    
    
    public abstract void show();
    
    abstract class Student extends Person{
        public String indexNumber;
    }
    public class Freshman extends Student{
        
        @Override
        public void show(){
            System.out.println("Freshamn: " + firstName + lastName + "ID. NO: " + indexNumber);
        }
    }
        
    
    public static void main(String[] args){
        
        Freshman f = new Freshman();
        f.firstName = "Jane";
        f.lastName = "Doe";
        f.indexNumber = "68/2016";
        f.show();
    }
    
    
}
