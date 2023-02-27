/*Global Manufactures Company mantiene y repara coches, tiene muchos talleres por
todo el mundo. Cuando un coche es traído para servicio a un taller de Global
Manufacturers Company, este es enviado al departamento de mantenimiento. Sin
embargo, si se encuentra dañado y es traído para ser reparado, se envía al
departamento de reparación. Después de terminar el mantenimiento o reparación del
coche, un supervisor lo examina y el coche se devuelve al cliente.
Desarrolle el diagrama de flujo que represente el algoritmo para este problema. */

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String [] ajnsdajasdn) {
    
        System.out.println("¿Está dañado?");
            Scanner sc = new Scanner(System.in);
        String carroCondicionEntrada = sc.nextLine();
        boolean carroCondicion=true;
        carroCondicionEntrada = carroCondicionEntrada.toLowerCase();
        if (carroCondicionEntrada.equals("si")){
            carroCondicion=true;
        }
        else{
            carroCondicion=false;
        }
        
        if (carroCondicion == true){
            System.out.println("Departamento de reparación");
        }
        else
        System.out.println("Departamento de mantenimiento");
            
    }
}