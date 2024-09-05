import java.util.Scanner;
 // video 65
public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println("Prestamo de libros");

        boolean Credenciales;
        var DistanciaVivienda = 0;
        var Prestamos = true;

        System.out.println("Tienes credenciales de estudiante ?  (true / false ): ");
        Credenciales = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        System.out.println("A cuantos Km a la redonda vives : ");
        DistanciaVivienda = Integer.parseInt(new Scanner(System.in).nextLine());

        Prestamos = Credenciales == true || DistanciaVivienda <= 3;

        System.out.println(" Su solicitud de prestamo es : "   + Prestamos);

    }
}
