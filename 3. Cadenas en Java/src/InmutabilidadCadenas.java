public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilida de cadenas

        var Cadena1 = "Hola";
        System.out.println("Cadena1 sin modificar = " + Cadena1);

        //Cambio de cadena y posterior impresion

        Cadena1 = "Adios";
        System.out.println("Cadena1  modificado = " + Cadena1);
    }
}
