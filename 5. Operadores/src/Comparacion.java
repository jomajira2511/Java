public class Comparacion {
    public static void main(String[] args) {

        System.out.println(" Operadores de COMPARACION" );
        
        int a = 3, b =2 ;
        
        var Resultado = a==b;  //Comparacion de igualdal
        var Distinto  = a!=b; //Comparacion de diferencia
        var MayorQue  = a >b; //Comparacion de mayor 
        var MayorOIgual = a>=b; //Comparacion Mayor o igual que
        var MenorQue = a<b;  //Comparacion Menos que
        var MenorOIgual = a<=b; //Comparacion Menor o igual


        System.out.println("Resultado = " + Resultado);
        System.out.println("Distinto = " + Distinto);
        System.out.println("Mayor Que = " + MayorQue);
        System.out.println("Mayor O Igual = " + MayorOIgual);
        System.out.println("Menor Que = " + MenorQue);
        System.out.println("Menor O Igual = " + MenorOIgual);
        
    }
}
