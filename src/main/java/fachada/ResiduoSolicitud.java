/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

/**
 *
 * @author Rosa Rodriguez
 */
public class ResiduoSolicitud {
    private int cantidad;
    private String tipo;
    private Residuo residuo;

    public ResiduoSolicitud(int cantidad, String tipo, Residuo residuo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.residuo = residuo;
    }

    public ResiduoSolicitud() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
    
    
    
}
