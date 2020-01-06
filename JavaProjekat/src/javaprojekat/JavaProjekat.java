package javaprojekat;

public class JavaProjekat {

    public static void main(String[] args) {
      
       
    }
    public static void getPerimeter(int... corners)
    {
        int perimeter = 0;
        if(corners.length < 2)
        {
            System.out.println("Poligon mora da ima vise od jedne strane");
        }
        else
        {
            for (int i = 0; i < corners.length; i++) {
                perimeter += corners[i];
            }
            System.out.println(perimeter);
        }
    }
}
