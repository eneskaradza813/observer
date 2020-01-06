package generics;

import java.util.ArrayList;


public class Generics {

    public static void main(String[] args) {

        
        ArrayList<Person> arrayList = new ArrayList();
        
        Person p1 = new Person("John", "Davidson");
        Person p2 = new Person("Clive", "Robertson");
        
        arrayList.add(p1);
        arrayList.add(p2);
        
        for (Person p : arrayList) {
            System.out.println("Name: " + p.name + " Surname:" + p.surname);
            
        }
        
        
        
    }
}
