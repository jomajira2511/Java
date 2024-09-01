public class MetodosCadena {
    public static void main(String[] args) {
        ///---------------METODOS DE CADENAS-----------------


        //Longitud de una Cadena
        var Cadena1 = "Hola mundo";
        var LongitudDeCadena = Cadena1.length();
        System.out.println("Longitud = " + LongitudDeCadena);

        //Reemplazar Caracteres de la cadena

        var Cadena2 = "Hola Mundo";
        var CadenaModificada = Cadena2.replace('o', 'a');
        System.out.println("CadenaModificada = " + CadenaModificada);
        System.out.println("Cadena2 = " + Cadena2);

        //Convertir cadenas a mayusculas

        var Cadena3 = "hola mundo ";
        var ConvertirAMayusculas = Cadena3.toUpperCase();
        System.out.println("ConvertirAMayusculas = " + ConvertirAMayusculas);
        
        
        //Convertir Cadenas a Minusculas 
        var Cadena4 = "HOLA MUNDO";
        var ConvertirAMinusculas = Cadena4.toLowerCase();
        System.out.println("ConvertirAMinusculas = " + ConvertirAMinusculas);
        
        //Eliminar espacios en blanco al inicio o al final
        var Cadena5 = "  HOLA MUNDO  ";
        var EliminarEspacios = Cadena5.trim();
        System.out.println("EliminarEspacios = " + EliminarEspacios);


    }
}
