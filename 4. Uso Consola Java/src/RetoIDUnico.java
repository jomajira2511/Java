import java.awt.image.ConvolveOp;
import java.util.Random;
import java.util.Scanner;

public class RetoIDUnico {
    public static void main(String[] args) {
        //Definicion de las variables y librerias
        var Consola = new Scanner(System.in);
        var Random = new Random();

        var NumeroAleatorio = Random.nextInt(9999) + 1 ;  //1 to 9999

        System.out.print("Ingresa tu Nombre: ");
        var Nombre = Consola.nextLine();

        System.out.print("Ingresa tu apellido: ");
        var Apellido = Consola.nextLine();

        System.out.print("Ingresa tu año de nacimiento (YYYY): ");
        var AnnoNacimiento  =  Integer.parseInt(Consola.nextLine());

        var NombreArreglado = Nombre.substring(0,2).toLowerCase();
        var ApellidoArreglado =Apellido.substring(0,2).toUpperCase();
        var FechaArreglada  = AnnoNacimiento = AnnoNacimiento %100; //Otra forma de hacer es con  un substring y en la posicion numero 2
        var AleatorioArreglado = String.format("%04d",NumeroAleatorio);


        System.out.println("************ GENERADOR DE ID ***************" );
        System.out.println("NombreArreglado = " + NombreArreglado);
        System.out.println("ApellidoArreglado = " + ApellidoArreglado);
        System.out.println("FechaArreglada = " + FechaArreglada);
        System.out.println("AleatorioArreglado  = " + AleatorioArreglado);
        System.out.println(" \t ID Unico generado es :  " + NombreArreglado + ApellidoArreglado + FechaArreglada + AleatorioArreglado);






    }
}
