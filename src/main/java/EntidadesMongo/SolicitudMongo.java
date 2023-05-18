/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
/**
 *
 * @author luis-
 */
public class SolicitudMongo {
    private ObjectId id_solicitud;
    private Date fechaSalida;
    private List<ResiduoSolicitud> rs;
    private String estado;

    public SolicitudMongo(ObjectId id_solicitud, Date fechaSalida, List<ResiduoSolicitud> rs, String estado) {
        this.id_solicitud = id_solicitud;
        this.fechaSalida = fechaSalida;
        this.rs = rs;
        this.estado = estado;
    }

    public SolicitudMongo(Date fechaSalida, List<ResiduoSolicitud> rs, String estado) {
        this.fechaSalida = fechaSalida;
        this.rs = rs;
        this.estado = estado;
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

    public List<ResiduoSolicitud> getRs() {
        return rs;
    }

    public void setRs(List<ResiduoSolicitud> rs) {
        this.rs = rs;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
