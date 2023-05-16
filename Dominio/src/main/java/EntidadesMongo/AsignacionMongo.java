/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;
import Entidades.*;
import java.util.ArrayList;
import org.bson.types.ObjectId;
/**
 *
 * @author luis-
 */
public class AsignacionMongo {
    
    private ObjectId id_asignacion;
    private Residuo residuo;
    private ArrayList<Traslado>traslados;
    private Solicitud solicitud;

    public AsignacionMongo(ObjectId id_asignacion, Residuo residuo, ArrayList<Traslado> traslados, Solicitud solicitud) {
        this.id_asignacion = id_asignacion;
        this.residuo = residuo;
        this.traslados = traslados;
        this.solicitud = solicitud;
    }

    public AsignacionMongo(Residuo residuo, ArrayList<Traslado> traslados, Solicitud solicitud) {
        this.residuo = residuo;
        this.traslados = traslados;
        this.solicitud = solicitud;
    }

    public AsignacionMongo() {
    }

    public ObjectId getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(ObjectId id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public ArrayList<Traslado> getTraslados() {
        return traslados;
    }

    public void setTraslados(ArrayList<Traslado> traslados) {
        this.traslados = traslados;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    
    
    
    
}
