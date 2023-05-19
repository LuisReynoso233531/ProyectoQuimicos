/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;
import fachada.EmpresaAsignacion;
import fachada.Productor;
import fachada.Residuo;
import fachada.Traslado;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;
/**
 *
 * @author luis- y rosa
 */
public class AsignacionMongo {
    
    private ObjectId id_asignacion;
    private Residuo residuo;
    private Productor productor;
    private List<EmpresaAsignacion> empresas;
    private ArrayList<Traslado>traslados;
    private float cantidadTotal;

    public AsignacionMongo() {
    }

    public AsignacionMongo(ObjectId id_asignacion, Residuo residuo, Productor productor, List<EmpresaAsignacion> empresas, ArrayList<Traslado> traslados, float cantidadTotal) {
        this.id_asignacion = id_asignacion;
        this.residuo = residuo;
        this.productor = productor;
        this.empresas = empresas;
        this.traslados = traslados;
        this.cantidadTotal = cantidadTotal;
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

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public List<EmpresaAsignacion> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<EmpresaAsignacion> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Traslado> getTraslados() {
        return traslados;
    }

    public void setTraslados(ArrayList<Traslado> traslados) {
        this.traslados = traslados;
    }

    public float getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(float cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id_asignacion);
        hash = 41 * hash + Objects.hashCode(this.residuo);
        hash = 41 * hash + Objects.hashCode(this.productor);
        hash = 41 * hash + Objects.hashCode(this.empresas);
        hash = 41 * hash + Objects.hashCode(this.traslados);
        hash = 41 * hash + Float.floatToIntBits(this.cantidadTotal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AsignacionMongo other = (AsignacionMongo) obj;
        if (Float.floatToIntBits(this.cantidadTotal) != Float.floatToIntBits(other.cantidadTotal)) {
            return false;
        }
        if (!Objects.equals(this.id_asignacion, other.id_asignacion)) {
            return false;
        }
        if (!Objects.equals(this.residuo, other.residuo)) {
            return false;
        }
        if (!Objects.equals(this.productor, other.productor)) {
            return false;
        }
        if (!Objects.equals(this.empresas, other.empresas)) {
            return false;
        }
        return Objects.equals(this.traslados, other.traslados);
    }

}
