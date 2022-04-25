/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.técnicas.programación;

import java.util.HashSet;
import javax.swing.JOptionPane;


/**
 *
 * @author jfeli
 */
public class Compra {
    public static void main(String[] args) {
        Articulos articulo = new Articulos();
        Factura fact = new Factura();
        
        
        int limite_clientes, i, limite_articulos, j, k;
        
        limite_clientes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de clientes que van a comprar")); // la cantidad de clientes que van a comprar
        
        for(i=0;i<limite_clientes;i++){
            fact = new Factura();
            fact.nombre.setNombre_cliente(JOptionPane.showInputDialog(null, "Digite el nombre del cliente"));
            fact.nombre.setCedula_cliente(Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula del cliente")));
            fact.nombre.setEdad_cliente(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del cliente")));
            
        
            
            limite_articulos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de artículos que el cliente va a comprar"));
            for(j=0;j<limite_articulos;j++){
                    articulo = new Articulos();
                    articulo.setNombre_articulos(JOptionPane.showInputDialog(null, "Digite el nombre del producto"));
                    articulo.setPrecio_articulos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio de "+articulo.getNombre_articulos())));
                    articulo.setCantidad_articulos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de " +articulo.getNombre_articulos())));
                    
                    fact.compra.add(articulo);
                   
                    
            }
            fact.imprimirDatos();
  
        }
        
       
    }
}
