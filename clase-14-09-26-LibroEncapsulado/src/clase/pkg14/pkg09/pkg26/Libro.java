/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg14.pkg09.pkg26;

/**
 *
 * @author Alumno
 */
public abstract class Libro {
    // Lo private hace que sea solo accesible aquí dentro
    private String titulo;
    private String autor;
    private double precio;
    private int stock;
    
    public Libro (String titulo, String autor, double precio, int stock ){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(){
        if (precio < 0){
            throw new IllegalArgumentException("No se acepta un presio negativo");
        }
    }
    
    public int getStock(){
        return stock;
    }
    public void setStock(){
        if (stock < 1){
            throw new IllegalArgumentException("Minimo almenos un libro que este");
        }
    }
   public void mostrarInfo(){
       System.out.println(" Ficha del libro");
       System.out.println("Titulo" + this.titulo);
       System.out.println("Autor" + this.autor);
       System.out.println("Precio"+ this.precio );
       System.out.println("Stock" + this.stock);
   }
}
