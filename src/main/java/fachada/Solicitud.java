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

        if(this.residuosSolicitud == null || this.residuosSolicitud.isEmpty()) {
            throw new MalformedSolicitud("La solicitud esta vacia");
        }
        
        if(verificarPeso()) {
            throw new MalformedSolicitud("El peso de algun residuo esta mal");
        }
        
        if(verificarTipo()) {
            throw new MalformedSolicitud("El tipo de algun residuo es incorrecto");
        }
        
        if (verificarFecha()) {
            throw new MalformedSolicitud("La fecha de la solicitud no es correcta");
        }

    }

    private boolean verificarTipo() {
        for (ResiduoSolicitud rs : this.residuosSolicitud) {
            if(rs.getTipo() == null) {
                return true;
            }
            if(!(rs.getTipo().equalsIgnoreCase("l") || rs.getTipo().equalsIgnoreCase("k"))) {
                return true;
            }

        }
        return false;
    }
    
    private boolean verificarPeso() {
        for (ResiduoSolicitud rs : this.residuosSolicitud) {

            if (rs.getCantidad() <= 0) {
                return true;
            }

        }
        return false;
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
