import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //Numeros aleatorios
        var Random = new Random();  //Se crea la variable randon


        //Generacion de numero aleatorio de tipo int

        var NumeroAleatorio = Random.nextInt(10);  //0  to n-1
        System.out.println("Numero Aleatorio = " + NumeroAleatorio);

        NumeroAleatorio = Random.nextInt(10) + 1 ;
        System.out.println("Numero Aleatorio de  1  a 10  = " + NumeroAleatorio);

        //generacion de numero aleatorio usando float

        var AleatorioFlotante = Random.nextFloat();  //si no se pone nada asigna 0.0 y 1.0
        System.out.println("AleatorioFlotante = " + AleatorioFlotante);
        
        var BooleanAleatorio = Random.nextBoolean();
        System.out.println("BooleanAleatorio = " + BooleanAleatorio);
    }
}
