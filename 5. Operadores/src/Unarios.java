public class Unarios {
    public static void main(String[] args) {
        System.out.println(" Operadores Unarios ");
        int a = 3, b= -2, Resultado;
        var c=  true;

        //Operador unario  + y -
        Resultado =  +a;
        System.out.println("Resultado  +a = " + Resultado);
        Resultado = -a ;
        System.out.println("Resultado  -a = " + Resultado);

        //Operadores unarios de incremento y decremento
        //Pre incremento
        a = 3;
        Resultado= ++a;
        System.out.println(" Resultado  de un incremento usando ++a = " +  Resultado);
        // Post incremento, se incrementa pero se guarda en memoria, no se muestra
        a = 3;
        Resultado= a++ ;
        System.out.println(" Resultado  de un incremento usando a++ = " +  Resultado);

        //pre- Decremento
         b= -2;
        Resultado = --b;
        System.out.println("Resultado  de un decremento usando --b = " + Resultado);
        //Pos Decremento
        b = -2;
        Resultado = --b;
        System.out.println("Resultado b-- = " + Resultado);
        System.out.println("Resultado  = " + Resultado);







    }
}
