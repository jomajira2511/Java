public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas

        var CadenaOriginal = "Hola mundo";
        System.out.println("Cadena Original  = " + CadenaOriginal);

        //Reemplazar una subcadena
        var ReemplazoCadena = CadenaOriginal.replace("mundo", "A todos");
        System.out.println("ReemplazoCadena = " + ReemplazoCadena);


    }
}
