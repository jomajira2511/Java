public class Logicos {
    public static void main(String[] args) {
        System.out.println("Operadores LOGICOS ");

        //&& regresa true si AMBOS son verdaderos
        // || Regresa verdadero si uno solo cumple la condicion
        //  ! Invierte el valor logicos solo usa un esperando

        boolean a = true, b = false;

        var Resultado = a && b;

        var Resultado2 = a || b ;

        var Conversion = !a ;
        var Conversion2 = !b;
        

        System.out.println("Resultado & = " + Resultado);

        System.out.println("Resultado  || = " + Resultado2);

        System.out.println("Conversion a ! = " + Conversion);

        System.out.println("Conversion2 b ! = " + Conversion2);


    }
}
