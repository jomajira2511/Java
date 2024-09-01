public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de Cadenas

        var Cadena1 = "Java";
        var Cadena2 = "Java";

        var Cadena3 = new String("java");

        //Prueba primeras dos cadenas
        System.out.println(" Cadena 1 es la misma referencia que la Cadena2 ");
        System.out.println(Cadena1 == Cadena2);

        //Pruebas nueva cadena que apunta a otro objeto

        System.out.println("Cadena 3 que tiene los mismos caracteres que la cadena1 y cadena2");
        System.out.println(Cadena3 == Cadena1 );

        //Comparando contenido

        System.out.println("Comparando el contenido de la Cadena1 con la cadena 3");
        System.out.println(Cadena3.equals(Cadena1));



    }
}
