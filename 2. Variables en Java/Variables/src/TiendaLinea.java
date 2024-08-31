public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("****  E-Commerce Online   **** ");
        String NombreProducto = "Milk ";
        double Precio = 1.500;
        int Cantidad = 15;
        boolean DisponibleVenta = true;

        //Impresion E-Commerce

        System.out.println("NombreProducto = " + NombreProducto);
        System.out.println("Precio = " + Precio);
        System.out.println("Cantidad = " + Cantidad);
        System.out.println("DisponibleVenta = " + DisponibleVenta);

        //Modificacion Variables

        NombreProducto =  "Computer";
        Precio = 20.0000;
        Cantidad = 10;
        DisponibleVenta = false;

        System.out.println();
        System.out.println("NombreProducto = " + NombreProducto);
        System.out.println("Precio = " + Precio);
        System.out.println("Cantidad = " + Cantidad);
        System.out.println("DisponibleVenta = " + DisponibleVenta);
    }
}
