public class RetoGenerarEmail {
    public static void main(String[] args) {
        //GENERADOR DE EMAIL USANDO CADENAS

        //Generamos Las cadenas con los datos requeridos por el sistems
        var Nombre = "Pepito Perez Padro";
        var Empresa = "Programacion Java";
        var Dominio = "com.co";
        final  char arroba = '@';
        
        //Generamos las cadenas que se desean imprimir 
        var NombreUsuarioNormalizado = Nombre.replace(' ', '.');
            NombreUsuarioNormalizado=NombreUsuarioNormalizado.toLowerCase();
        var NombreDominioNormalizado = "." + Dominio.substring(0);
        var NombreDominioEmailNormalizado = arroba + Empresa.replace(" ", "") + NombreDominioNormalizado;
        var NombreCorreoGenerador = NombreUsuarioNormalizado +NombreDominioEmailNormalizado;


        //Impresion de los datos
        System.out.println("\n \n************ Generador de Email ***************** \n");
        System.out.println("Nombre = " + Nombre);
        System.out.println("Nombre Usuario Normalizado = " + NombreUsuarioNormalizado +"\n");
        System.out.println("Empresa = " + Empresa);
        System.out.println("Nombre Dominio Normalizado = " + NombreDominioNormalizado);
        System.out.println("Nombre Dominio Email Normalizado = " + NombreDominioEmailNormalizado +"\n");
        System.out.println("Nombre Correo Generador = " + NombreCorreoGenerador);
        
    }
}
