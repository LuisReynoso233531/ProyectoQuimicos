/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesMongo;

import fachada.Empresa;
import fachada.Transporte;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Rosa Rodriguez
 */
public class EmpresaMongo extends Empresa{

    private List<Transporte> transportes;
    
    public EmpresaMongo() {
        super();
    }

    public EmpresaMongo(Empresa e) {
        this.nombre = e.getNombre();
        this.disponible = e.isDisponible();
    }
    
    public EmpresaMongo(String nombre, boolean disponible) {
        super(nombre, disponible);
    }

    public List<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(List<Transporte> transportes) {
        this.transportes = transportes;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.transportes);
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
        final EmpresaMongo other = (EmpresaMongo) obj;
        return Objects.equals(this.transportes, other.transportes);
    }

    
}
