import java.util.Scanner;

public class LecturaTiposDeDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer  un dato por consola
        var Consola = new Scanner(System.in);

         // Tipo de dato entero
        System.out.print("Ingresa tu edad: ");
        var Edad = Consola.nextInt();
        System.out.println("Edad = " + Edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var Altura = Consola.nextDouble();
        System.out.println("Altura = " + Altura);

        // Consumimos el caracter de salto de linea
        Consola.nextLine();

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var Nombre = Consola.nextLine();
        System.out.println("Nombre = " + Nombre);


        // Conversion de datos En java

        //Dato entero
        System.out.println("Ingeresa un dato entero  : ");
       /* var EnteroString = Consola.nextLine();  // Ingresa un dato de tipo cadena en la consola
        var Entero = Integer.parseInt(EnteroString); //Se asigna la cadena anterior y se hace la conversiona  eentero */
        var Entero = Integer.parseInt(Consola.nextLine());
        System.out.println("Entero = " + Entero);

        //Dato Flotante o double
        System.out.println("Ingresa un dato de tipo flotante ");
        var  Flotante =Float.parseFloat(Consola.nextLine());
        System.out.println("flotante = " + Flotante);
    }
}
