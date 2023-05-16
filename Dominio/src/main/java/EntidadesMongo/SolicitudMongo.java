/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;
import Entidades.*;
import java.util.Date;
import org.bson.types.ObjectId;
/**
 *
 * @author luis-
 */
public class SolicitudMongo {
    private ObjectId id_solicitud;
    private Date fechaSalida;
    private Residuo residuo;
    private String estado;
    private float cantidad;
    private String tipo;

    public SolicitudMongo(ObjectId id_solicitud, Date fechaSalida, Residuo residuo, String estado, float cantidad, String tipo) {
        this.id_solicitud = id_solicitud;
        this.fechaSalida = fechaSalida;
        this.residuo = residuo;
        this.estado = estado;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public SolicitudMongo(Date fechaSalida, Residuo residuo, String estado, float cantidad, String tipo) {
        this.fechaSalida = fechaSalida;
        this.residuo = residuo;
        this.estado = estado;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public SolicitudMongo() {
    }

    public ObjectId getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(ObjectId id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
