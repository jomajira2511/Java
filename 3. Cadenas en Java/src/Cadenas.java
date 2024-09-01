public class Cadenas {
    public static void main(String[] args) {
        System.out.println(" ****** Manejo de cadenas en JAVA *********");
        var Cadena = "Esta es una cadena ";
        var CadenaGrande =new String(
                """
                Mi nombre 
                es
                Jhon
                Mario 
                """
        ) ;

        System.out.println("Cadena = " + Cadena);
        System.out.println("CadenaGrande = " + CadenaGrande);

        CadenaGrande = "Mi nueva Cadena";
        System.out.println("CadenaGrande = " + CadenaGrande);
    }
}
