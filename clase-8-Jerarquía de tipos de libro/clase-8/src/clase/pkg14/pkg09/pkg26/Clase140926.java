/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg14.pkg09.pkg26;

//Voy a animar hacer el desafio
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Clase140926 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ahora tengo que crear un objeto para cada subtipo con un dato de ejemplo
        LibroFisico libro1 = new LibroFisico(" A la Caza de Jack el Destripador", "Kerri Maniscalco", 34840.0, 1500.0, 10);
        LibroDigital libro2 = new LibroDigital("Aprende a programar con Java", "Alfonso Jiménez Marín y Francisco Manuel Pérez Montes", 43050.0, "PDF");
        LibroUsado libro3 = new LibroUsado("El Señor de los Anillos", "J.R.R. Tolkien", 18000.0, "Bueno");
        
        // Luego tengo que ver si va a: mostrarInfo(), mostrarDetalle() y calcularPrecioFinal() para cada uno
        System.out.println("=== LIBRO FÍSICO ===");
        libro1.mostrarInfo();
        libro1.mostrarDetalle();
        System.out.println("Precio Final: $" + libro2.calcularPrecioFinal());
        ///////////////////////////////
        System.out.println("\n=== LIBRO DIGITAL ===");
        libro2.mostrarInfo();
        libro2.mostrarDetalle();
        System.out.println("Precio Final: $" + libro2.calcularPrecioFinal());
        ///////////////////////////////
        System.out.println("\n=== LIBRO USADO ===");
        libro3.mostrarInfo();
        libro3.mostrarDetalle();
        System.out.println("Precio Final: $" + libro3.calcularPrecioFinal());
        
        // aver dsi me sale el desafio
        
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(libro1);
        biblioteca.add(libro2);
        biblioteca.add(libro3);
        
        System.out.println("\n=== TABLA GENERAL (Desafío) ===");
        for (Libro l : biblioteca){
            System.out.println("- " + l.getTitulo() + " | Precio Final: $" + l.calcularPrecioFinal());
        }
    }
    
}
