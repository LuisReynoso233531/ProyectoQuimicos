/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import Excepciones.MalformedAsignacion;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ross
 */
public class Asignacion {
    
    private Residuo residuo;
    private List<EmpresaAsignacion> empresas;
    private float cantidadTotal;
    private Productor solicitante;
    
    public Asignacion() {
    }

    public Asignacion(Residuo residuo, List<EmpresaAsignacion> empresas, float cantidadTotal, Productor solicitante) throws MalformedAsignacion {
        this.residuo = residuo;
        this.empresas = empresas;
        this.cantidadTotal = cantidadTotal;
        this.solicitante = solicitante;
        verificar();
    }
    private void verificar() throws MalformedAsignacion{
        if(empresas == null || empresas.isEmpty())
        {
            throw new MalformedAsignacion("No puede haber asignacion sin empresas");
        }
    }
    
    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public List<EmpresaAsignacion> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<EmpresaAsignacion> empresas) {
        this.empresas = empresas;
    }

    public float getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(float cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public void asignaEnPartesIguales() {
        for(EmpresaAsignacion em : empresas) {
            em.setAsignado(cantidadTotal/empresas.size());
        }
    }

    public Productor getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Productor solicitante) {
        this.solicitante = solicitante;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.residuo);
        hash = 79 * hash + Objects.hashCode(this.empresas);
        hash = 79 * hash + Float.floatToIntBits(this.cantidadTotal);
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
