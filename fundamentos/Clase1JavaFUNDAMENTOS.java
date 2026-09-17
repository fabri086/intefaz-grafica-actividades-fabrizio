/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg1.java.fundamentos;
//Aca va los import de los pack
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Clase1JavaFUNDAMENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola,Usuario");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa su nombre porfavor");
        String nombre = sc.nextLine();
        System.out.println("El nombre es: " + nombre);
        
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("La edad es: " + edad);
        
        System.out.println("ingrese un numero a: ");
        int a = Integer.parseInt(sc.nextLine()); 
        System.out.println("ingrese un numero b: ");
        int b = Integer.parseInt(sc.nextLine()); 
        
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b ));
        System.out.println("Multiplicado: " + (a * b ));
        System.out.println("Division: " + (a / b ));


        
    }
    
}
//imprimir Hola, Mundo
