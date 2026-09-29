/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg14.pkg09.pkg26;

/**
 *
 * @author Alumno
 */

// Nuevos cambios de clase 8, con 2 nuevas funciones son: clase hija, abstracta
/* abstracta: Sirve como molde para las subclases: define lo común,
pero obliga a crear objetos de las clases hijas concretas 
*/

public abstract class Libro {
    private String titulo;
    private String autor;
    private double precioBase;
    
    //hice unos cambios nuevos
    public Libro (String titulo, String autor, double precioBase ){
        this.titulo = titulo;
        this.autor = autor;
        this.precioBase = precioBase;
    }
    
    // Estos son los Getters
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    //Nuevo metodos para todos los libros
   public void mostrarInfo(){
       System.out.println("--- Ficha del Libro ---");
       System.out.println("Título: " + this.titulo);
       System.out.println("Autor: " + this.autor);
   }
   
   // Armo el "abstracto"
   public abstract double calcularPrecioFinal();
   public abstract void mostrarDetalle();
}
