/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import Excepciones.MalformedSolicitud;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alan Rodriguez
 */
public class Solicitud {

    private Date fechaSalida;
    private List<ResiduoSolicitud> residuosSolicitud;
    private Productor productor;

    public void verificar() throws MalformedSolicitud {

        if(this.residuosSolicitud == null) {
            throw new MalformedSolicitud("La solicitud esta mal hecha");
        }
        
        if(this.residuosSolicitud.isEmpty()) {
            throw new MalformedSolicitud("La solicitud esta mal hecha");
        }
        
        if (verificarPeso() || verificarFecha()) {
            throw new MalformedSolicitud("La solicitud esta mal hecha");
        }

    }

    private boolean verificarPeso() {
        
        
        for (ResiduoSolicitud rs : this.residuosSolicitud) {

            if (rs.getCantidad() <= 0 || rs.getTipo().equals("") || rs.getTipo() == null) {
                return true;
            }

        }
        int cantidad = 0;
        for (ResiduoSolicitud rs : this.residuosSolicitud) {

            if(rs.getTipo().equalsIgnoreCase("l") || rs.getTipo().equalsIgnoreCase("k")) {
                cantidad++;
            }

        }
        
        return cantidad!=this.residuosSolicitud.size();
    }

    private boolean verificarFecha() {
        if (fechaSalida == null || fechaSalida.before(new Date())) {
            return true;
        }
        return false;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public List<ResiduoSolicitud> getResiduosSolicitud() {
        return residuosSolicitud;
    }

    public void setResiduosSolicitud(List<ResiduoSolicitud> residuosSolicitud) {
        this.residuosSolicitud = residuosSolicitud;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

}
