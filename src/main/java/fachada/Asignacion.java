/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ross
 */
public class Asignacion {
    
    private Residuo residuo;
    private List<Empresa> empresas;
    private float cantidadTotal;

    public Asignacion() {
    }

    public Asignacion(Residuo residuo, List<Empresa> empresas, float cantidadTotal) {
        this.residuo = residuo;
        this.empresas = empresas;
        this.cantidadTotal = cantidadTotal;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
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
        hash = 43 * hash + Objects.hashCode(this.residuo);
        hash = 43 * hash + Objects.hashCode(this.empresas);
        hash = 43 * hash + Float.floatToIntBits(this.cantidadTotal);
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
        final Asignacion other = (Asignacion) obj;
        if (Float.floatToIntBits(this.cantidadTotal) != Float.floatToIntBits(other.cantidadTotal)) {
            return false;
        }
        if (!Objects.equals(this.residuo, other.residuo)) {
            return false;
        }
        return Objects.equals(this.empresas, other.empresas);
    }
    
    
}
