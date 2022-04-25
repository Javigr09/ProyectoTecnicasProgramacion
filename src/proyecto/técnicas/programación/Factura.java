/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.técnicas.programación;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jfeli
 */
public class Factura {
    public Clientes nombre = new Clientes();
    public List<Articulos> compra = new ArrayList<Articulos>();
    double total = 0.00;
    double iva = 0.00;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss"); 
   
    public void imprimirDatos(){
        String fact = "Detalle de la factura" +
                "\n Fecha: " + java.time.LocalDate.now() + 
                "\n Hora: " + java.time.LocalTime.now().format(dtf);
        

                
                
        fact += "\n \n  Nombre del cliente: " + nombre.getNombre_cliente() +
                "\n Cédula del cliente: " + nombre.getCedula_cliente() + 
                "\n Edad del cliente: " + nombre.getEdad_cliente();
        
        for (int i=0; i<compra.size(); i++)
        {
            double price = compra.get(i).getPrecio_articulos();
            int cant = compra.get(i).getCantidad_articulos();
            fact+= "\n \n El nombre de cada artículo es: " + compra.get(i).getNombre_articulos() + 
                   "\n El precio unitario de cada artículo es de: " +  Double.toString(price) +
                   "\n La cantidad de unidades es de: " + Integer.toString(cant);
            total +=price * cant;
        }
        iva = total*0.13;
        
        fact+= "\n \n El monto de la compra es: " + Double.toString(total) +
               "\n El impuesto de la compra es: " + Double.toString(iva) +
               "\n \n El monto TOTAL de la compra es: " + Double.toString(total+iva);
        
        
        JOptionPane.showMessageDialog(null, fact);
               
                
        
        
        
    }
    
}
