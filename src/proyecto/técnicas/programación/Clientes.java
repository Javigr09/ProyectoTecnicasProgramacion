/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.técnicas.programación;

/**
 *
 * @author jfeli
 */
public class Clientes {
    private String Nombre_cliente;
    private int Cedula_cliente;
    private int Edad_cliente;
    
    public Clientes(){
        
    }

    public Clientes(String Nombre_cliente, int Cedula_cliente, int Edad_cliente) {
        this.Nombre_cliente = Nombre_cliente;
        this.Cedula_cliente = Cedula_cliente;
        this.Edad_cliente = Edad_cliente;
    }

    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public int getCedula_cliente() {
        return Cedula_cliente;
    }

    public void setCedula_cliente(int Cedula_cliente) {
        this.Cedula_cliente = Cedula_cliente;
    }

    public int getEdad_cliente() {
        return Edad_cliente;
    }

    public void setEdad_cliente(int Edad_cliente) {
        this.Edad_cliente = Edad_cliente;
    }
    
    
    
    
            
}
