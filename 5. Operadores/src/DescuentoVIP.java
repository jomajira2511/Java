import java.util.Scanner;

public class DescuentoVIP {
    public static void main(String[] args) {

        ///Video 64
        System.out.println("---------------SISTEMA DE DESCUENTOS VIP--------------");
        var CantidadCompras = 0;
        System.out.print("Cuantas compras ha realizado en el dia de hoy ?  : ");
        CantidadCompras = Integer.parseInt(new Scanner(System.in).nextLine());
        var Miembro = true;
        System.out.print("Es usted un miembro de la tienda ? (true/ False)");
        Miembro = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        var AccesoVIP = CantidadCompras >=10 && Miembro == true;

        System.out.println("Acceso a descuentos VIP = " + AccesoVIP);


    }
}
