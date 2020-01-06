package javaprojekat;

public class Calc implements Operations, Operands {

    public double a;
    public double b;
    
    @Override
    public double add()
    {
        return a + b;
    }

    @Override
    public void setOperands(double a, double b) {
       this.a = a;
       this.b = b;
    }
}
