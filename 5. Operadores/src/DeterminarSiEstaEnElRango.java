import java.util.Scanner;

public class DeterminarSiEstaEnElRango {
    public static void main(String[] args) {

        //        Permite ver si un numero esta en un rango de numeros

        System.out.println("Valor dentro de un rango ");

        final var Minimo = 0;   ///Es una constante
        final  var Maximo = 5; // Es una constante


        System.out.print( "Proporciona un numero entre 0 y 5 : ");
        var Dato = Integer.parseInt(new Scanner(System.in).nextLine());

        //Verificar si el dato esta dentro de los rangos dados
        var DentroDeRango =  Dato >= Minimo && Dato <= Maximo; //Se usa and, que debe retornar verdadero si ambas son correctas


        System.out.println("Dentro De Rango = " + DentroDeRango);




    }
}
