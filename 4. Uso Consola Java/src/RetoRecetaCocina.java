import java.util.Scanner;

public class RetoRecetaCocina {
    public static void main(String[] args) {
        //Reto receta de cocina

        var Consola = new Scanner(System.in);

        //Toma de datos

        System.out.println("Nombre de la receta : ");
        var NombreReceta = Consola.nextLine();

        System.out.println("Ingredientes de la receta");
        var IngredientesReceta = Consola.nextLine();

        System.out.println("Tiempo de preparacion de le receta");
        var TiempoPreparacion = Consola.nextLine();


        System.out.println("Dificulta de la receta (Facil / Media / Alta) ");
        var DificultadReceta = Consola.nextLine();

        System.out.println("Nombre de la Receta = " + NombreReceta);
        System.out.println("Ingredientes de la Receta = " + IngredientesReceta);
        System.out.println("Tiempo de Preparacion = " + TiempoPreparacion);
        System.out.println("Dificultad de la Receta = " + DificultadReceta);

    }
}
