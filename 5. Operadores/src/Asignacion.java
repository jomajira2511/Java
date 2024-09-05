public class Asignacion {
    public static void main(String[] args) {

        //Asignacion simple

        var MiNumero  =10;   //Asignacion simple

        System.out.println("Mi Numero original  = " + MiNumero);
        //Asignacion compuesto

        // += permite hacer una suma a un valor definido

        var Suma = MiNumero += 5;  // Es igual a poner MiNumero +5;
        var Resta = MiNumero -= 5;
        var Multiplicacion = MiNumero *5;
        var Division = MiNumero /5;
        var Modulo = MiNumero %5;

        System.out.println("Suma = " + Suma);
        System.out.println("Resta = " + Resta);
        System.out.println("Multiplicacion = " + Multiplicacion);
        System.out.println("Division = " + Division);
        System.out.println("Modulo = " + Modulo);

    }
}
