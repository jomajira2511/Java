import java.util.Arrays;

public class FormateoDeCadenas {
    public static void main(String[] args) {
        //Formateo de cadenas en Java

        var Nombre = "Jhon";
        var Edad = 24;
        var Sueldo = 100.300;
        var NumeroEmpleado= 12;


        //string.format
        //Permite agregar diferentes variables dentro de una sola cadena, que en este caso usa Mensaje
        var Mensaje =String.format("Nombre: %s , Edad : %d , Salario :  %.3f   ", Nombre , Edad,  Sueldo);
        System.out.println( Mensaje);


        //Metodo printf
        //Metodo sin necesidad de tener que asignar el valor dentro de otra variable
        System.out.printf("Nombre: %s , Edad : %d , Salario :  %.3f   ", Nombre , Edad,  Sueldo);

        //Formateo usando bloque de texto  o text block con formatted
        //Se usa el formatted para llamar las variables guardadas en memoria
        Mensaje = """
                %n Detalle de la persona : \s
                \tNombre:  %s
                \tEdad: %d años
                \tSalario: %f
                """.formatted(Nombre, Edad, Sueldo);
        System.out.println( Mensaje);


        //Fromateo con text block pero usando printf

        System.out.printf(
                """
                %n Detalle de la persona : \s
                \tNombre:  %s
                \tNumero de empleado  %04d    
                \tEdad: %d años
                \tSalario: %f
                """, Nombre,  NumeroEmpleado, Edad, Sueldo);
        
        //al poner un %04 Quiere decir que agrega ceros hasta que de un numero de 4 digitos en caso de que el numero sea menor a 4 digitos





    }
}
