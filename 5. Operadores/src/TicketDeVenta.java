import java.util.Scanner;

public class TicketDeVenta {
    public static void main(String[] args) {
        //Video 67
        //Vamos a declarar 5 objetos

        double Producto1, Producto2, Producto3, Producto4, Producto5, PrecioFinal,  Impuesto ;

        System.out.print("Ingresa el valor del primer producto : ");
        Producto1= Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Ingresa el valor del segundo producto : ");
        Producto2= Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Ingresa el valor del tercer producto : ");
        Producto3= Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Ingresa el valor del cuarto producto : ");
        Producto4= Double.parseDouble(new Scanner(System.in).nextLine());

        System.out.print("Ingresa el valor del quinto producto : ");
        Producto5= Double.parseDouble(new Scanner(System.in).nextLine());

        PrecioFinal = Producto1 + Producto2 +Producto3+ Producto4 + Producto5;
        System.out.println("El precio final para su compra es  = " + PrecioFinal);
        Impuesto = PrecioFinal *0.15;
        PrecioFinal = PrecioFinal + Impuesto;
        System.out.printf("Despues de aplicarle impuestos el total a pagar es de  $%.0f: ", PrecioFinal);



    }
}
