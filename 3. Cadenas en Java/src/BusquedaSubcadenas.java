public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas, en este caso el 1 indice de las cadenas.
        var Cadena = "Hola Mundo";
        
        //Aparicion del primer subindice de la subcadena que se asigno
        var PrimerIndiceCadena= Cadena.indexOf("Hola");
        System.out.println("PrimerIndiceCadena = " + PrimerIndiceCadena);
        
        //Aparicion del ultimo subindice de la cadena que se busca
        var UltimoIndiceCadena = Cadena.lastIndexOf("Mundo");
        System.out.println("UltimoIndiceCadena = " + UltimoIndiceCadena);
        
        //Cuando se busca una subcadena y no se encuentra dentro de la cadena asignada, este devolvera un -1
        var SubCadenaInexistente = Cadena.indexOf("Java");
        System.out.println("SubCadenaInexistente = " + SubCadenaInexistente);
    }
}
