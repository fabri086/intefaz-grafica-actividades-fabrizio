/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg14.pkg09.pkg26;

/**
 *
 * @author Fabri
 */

//Este es el 2° subclase de LibroDigital
public class LibroDigital extends Libro {
    private String formato;
    
    public LibroDigital(String titulo, String autor, double precioBase, String formato){
        super(titulo, autor, precioBase);
        this.formato = formato;
    }
    
    @Override
    public double calcularPrecioFinal(){
        // voy a poner como minino 20% de descuento sobre el precio
        return getPrecioBase() * 0.8;
    }
    
    @Override
    public void mostrarDetalle(){
        System.out.println("Tipo: Libro Digital | Formato: " + this.formato);
    }
}
