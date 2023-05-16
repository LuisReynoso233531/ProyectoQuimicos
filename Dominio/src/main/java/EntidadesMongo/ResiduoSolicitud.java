/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;

import org.bson.types.ObjectId;
import Entidades.*;

/**
 *
 * @author luis-
 */
public class ResiduoSolicitud {
    
    private ObjectId id;
    private String tipo;
    private float Cantidad;
    private Residuo residuo;

    public ResiduoSolicitud(ObjectId id, String tipo, float Cantidad, Residuo residuo) {
        this.id = id;
        this.tipo = tipo;
        this.Cantidad = Cantidad;
        this.residuo = residuo;
    }

    public ResiduoSolicitud(String tipo, float Cantidad, Residuo residuo) {
        this.tipo = tipo;
        this.Cantidad = Cantidad;
        this.residuo = residuo;
    }

    public ResiduoSolicitud() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
    
    
}
