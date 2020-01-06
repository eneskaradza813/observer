
package javaprojekat;

public class Car {
    
    
    static final int wheels = 4;
    
    String make;
    String model;
    int numDoors;
    
    
   
    public Car(String make, String model, int nDoors)
    {
        this.make = make;
        this.model = model;
        numDoors = nDoors;
    }
    
    public void printDetails()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("No. of doors: " + numDoors);
        
    }
    public static void printNoWheels()
    {
        System.out.println("No. of wheels of every car is " + wheels);
    }
    public static double GetFuelConsuption(double litres, double kilometers)
    {
        return litres / (kilometers / 100);
    }
}
