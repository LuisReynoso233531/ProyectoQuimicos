/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import java.util.Objects;

/**
 *
 * @author Rosa Rodriguez
 */
public class EmpresaAsignacion{
    private Empresa empresa;
    private float asignado;

    public EmpresaAsignacion(Empresa empresa, float asignado) {
        this.empresa = empresa;
        this.asignado = asignado;
    }

    public EmpresaAsignacion() {
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public float getAsignado() {
        return asignado;
    }

    public void setAsignado(float asignado) {
        this.asignado = asignado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.empresa);
        hash = 17 * hash + Float.floatToIntBits(this.asignado);
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
        final EmpresaAsignacion other = (EmpresaAsignacion) obj;
        if (Float.floatToIntBits(this.asignado) != Float.floatToIntBits(other.asignado)) {
            return false;
        }
        return Objects.equals(this.empresa, other.empresa);
    }
    
}
