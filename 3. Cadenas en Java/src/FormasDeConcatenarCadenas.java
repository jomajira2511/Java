public class FormasDeConcatenarCadenas {
    public static void main(String[] args) {
        //Formas de concatenar en JAVA
        
        var Cadena1 ="Hola ";
        var Cadena2 = "Mundo";
        
        var ConcatenarUsandoMas = Cadena1 + " " + Cadena2;
        System.out.println("ConcatenarUsandoMas = " + ConcatenarUsandoMas);
        
        var ConcatenarUsandoConca = Cadena1.concat(Cadena2);
        System.out.println("ConcatenarUsandoConca = " + ConcatenarUsandoConca);
        
        var ConcatenarUsandoAppend = new StringBuffer();
        ConcatenarUsandoAppend.append(Cadena1).append(" ").append(Cadena2);
        System.out.println("ConcatenarUsandoAppend = " + ConcatenarUsandoAppend);

        var ConcatenarUsandoBuilder = new StringBuilder();
        ConcatenarUsandoBuilder.append(Cadena1).append(" ").append(Cadena2);
        System.out.println("ConcatenarUsandoBuilder = " + ConcatenarUsandoBuilder);
        
        var ConcatenarUsandoJoin = String.join( " ", Cadena1,  Cadena2 );
        System.out.println("ConcatenarUsandoJoin = " + ConcatenarUsandoJoin);
                ;

        

    }
}
