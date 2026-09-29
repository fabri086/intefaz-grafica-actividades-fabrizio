/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg14.pkg09.pkg26;

/**
 *
 * @author Fabri
 */

//Este es el 3° subclase de LibroUsado
public class LibroUsado extends Libro {
    private String estado; // como ejemplo si esta "bueno" o "malo"
    
    public LibroUsado(String titulo, String autor, double precioBase, String estado){
        super(titulo, autor, precioBase);
        this.estado = estado;
    }
    
    @Override
    public double calcularPrecioFinal(){
        //Aca sera solo el 50% de descuento el precio
        return getPrecioBase() * 0.5;
    }
    
    @Override
    public void mostrarDetalle(){
        System.out.println("Tipo: Libro Usado | Estado de conservación: " + this.estado);
    }
}
