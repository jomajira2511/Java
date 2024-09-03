import java.util.Scanner;

public class RetoEmpleados {
    public static void main(String[] args) {
        //Sistema de empleados


        System.out.println("------------ Sistema de empleados ---------- ");

        var Consola =  new  Scanner(System.in);  //Creacion del ingreso de datos por consola

        //Creacion de ingreso de datos por consola

        System.out.print("Ingresa Tu nombre : ");
        var NombreEmpleado = Consola.nextLine();

        System.out.print("Ingresa tu edad : ");
        var Edad =  Integer.parseInt(Consola.nextLine());

        System.out.print("Ingresa tu salario : ");
        var Salario = Double.parseDouble(Consola.nextLine());

        System.out.print("Eres jefe de Departamento? (true/false) : ");
        var JefeDepartamento = Boolean.parseBoolean(Consola.nextLine());

        //Impresion de datos ingresados

        System.out.println("Nombre Del Empleado = " + NombreEmpleado);
        System.out.println("Edad = " + Edad);
        System.out.println("Salario = " + Salario);
        System.out.println("JefeDepartamento = " + JefeDepartamento);

    }
}
