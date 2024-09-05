import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        // Video 71

        //Calcular area y perimetro de un rectangulo

        // Area = base x altura
        //Perimetro  =  2 x (Base + Altura)

        System.out.println("Vamos a calcular el area y el perimetrro del rectangulo ");
        double Base, Altura, Area, Perimetro;

        System.out.print("Ingresa el tamaño de  el Area del rectangulo : ");
        Base =  Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Ingresa el tamaño del perimetro  del rectangulo : ");
        Altura = Double.parseDouble(new  Scanner(System.in).nextLine());

        System.out.println("-------------------Resultados-------------------");

        Area = Base * Altura;
        System.out.println("El Area del rectungulo es  = " + Area);

        Perimetro =  (Base + Altura)  * 2;
        System.out.println("El Perimetro del rectangulo es  = " + Perimetro);


    }
}
