/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;

import fachada.Quimico;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author luis-
 */
public class ResiduoMongo {
    private ObjectId id;
    private String codigo;
    private List<Quimico> quimicos;
    private String nombre;
    private String nombreProductor;

    public ResiduoMongo(ObjectId id, String codigo, List<Quimico> quimicos, String nombre, String nombreProductor) {
        this.id = id;
        this.codigo = codigo;
        this.quimicos = quimicos;
        this.nombre = nombre;
        this.nombreProductor = nombreProductor;
    }

    public ResiduoMongo(String codigo, List<Quimico> quimicos, String nombre, String nombreProductor) {
        this.codigo = codigo;
        this.quimicos = quimicos;
        this.nombre = nombre;
        this.nombreProductor = nombreProductor;
    }

    public ResiduoMongo() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Quimico> getQuimicos() {
        return quimicos;
    }

    public void setQuimicos(List<Quimico> quimicos) {
        this.quimicos = quimicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProductor() {
        return nombreProductor;
    }

    public void setNombreProductor(String nombreProductor) {
        this.nombreProductor = nombreProductor;
    }
    
    
}
