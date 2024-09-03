import java.util.Scanner; //Libreria para el uso de la consola en Java

public class ConsolaBasico {
    public static void main(String[] args) {
        //Introducir datos en consola
        var DatoConsola = new Scanner(System.in); // in es INPUT, que es una entrada de datos basica
        System.out.print("Ingresa tu nombre completo : ");
        var Nombre = DatoConsola.nextLine(); //Guarda el nombre ingresado dentro de la consola
        System.out.println("Nombre = " + Nombre);
    }
}
