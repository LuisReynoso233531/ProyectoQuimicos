/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;

import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author luis-
 */
public class ResiduoMongo {
    private ObjectId Codigo;
    private ArrayList<String> quimicos;
    private String nombre;
    private String nombreProductor;

    public ResiduoMongo(ObjectId Codigo, ArrayList<String> quimicos, String nombre, String nombreProductor) {
        this.Codigo = Codigo;
        this.quimicos = quimicos;
        this.nombre = nombre;
        this.nombreProductor = nombreProductor;
    }

    public ResiduoMongo(ArrayList<String> quimicos, String nombre, String nombreProductor) {
        this.quimicos = quimicos;
        this.nombre = nombre;
        this.nombreProductor = nombreProductor;
    }

    public ResiduoMongo() {
    }

    public ObjectId getCodigo() {
        return Codigo;
    }

    public void setCodigo(ObjectId Codigo) {
        this.Codigo = Codigo;
    }

    public ArrayList<String> getQuimicos() {
        return quimicos;
    }

    public void setQuimicos(ArrayList<String> quimicos) {
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
