/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.técnicas.programación;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jfeli
 */
public class Articulos  {
    
    private String Nombre_articulos;
    private int Cantidad_articulos;
    private double Precio_articulos;
    
    public Articulos(){
        
    }

    public Articulos(String Nombre_articulos,int Cantidad_articulos, double Precio_articulos, String Nombre_cliente, int Cedula_cliente, int Edad_cliente) {
        
        this.Cantidad_articulos = Cantidad_articulos;
        this.Nombre_articulos = Nombre_articulos;
        this.Precio_articulos = Precio_articulos;
    }

    public int getCantidad_articulos() {
        return Cantidad_articulos;
    }

    public void setCantidad_articulos(int Cantidad_articulos) {
        this.Cantidad_articulos = Cantidad_articulos;
    }
    


    public String getNombre_articulos() {
        return Nombre_articulos;
    }

    public void setNombre_articulos(String Nombre_articulos) {
        this.Nombre_articulos = Nombre_articulos;
    }

    public double getPrecio_articulos() {
        return Precio_articulos;
    }

    public void setPrecio_articulos(double Precio_articulos) {
        this.Precio_articulos = Precio_articulos;
    }
      
}