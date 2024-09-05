import java.util.Scanner;

public class SistemaDeAutentificacion {
    public static void main(String[] args) {
        //video 69
        //Sistema de autentificacion
        //Creacion de las contantes

        final   var User = "Admin";
        final  var Password = "Admin";
        boolean Comprobar = true;
        System.out.println("-----Sistema de autentificacion ------");
        System.out.print("Ingresa tu usuario : ");
        var UserLogin = new Scanner(System.in).nextLine();

        System.out.println("Ingresa tu password : ");
        var UserPassword = new Scanner(System.in).nextLine();

        Comprobar = UserLogin == User && UserPassword == Password;

        System.out.println("El acceso al sistema es  : " + Comprobar);







    }
}
