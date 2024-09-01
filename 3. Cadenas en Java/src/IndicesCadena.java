public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indice de cadenas

        var Cadena1 = "Hola mundo ";

        //Recuperando el primer caracter
        var PrimerElementoCadena = Cadena1.charAt(0);
        System.out.println("PrimerElementoCadena = " + PrimerElementoCadena);

        //Recuperando el ultimo caracter
        var UltimoCaracterCadena =Cadena1.charAt(9);
        System.out.println("UltimoCaracterCadena = " + UltimoCaracterCadena);

        var RecueperandoLetraAleatoria = Cadena1.charAt(5);
        System.out.println("RecueperandoLetraAleatoria = " + RecueperandoLetraAleatoria);


    }
}
