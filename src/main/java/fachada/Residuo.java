/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Alan Rodriguez
 */
public class Residuo {
    
    private String codigo;
    private List<Quimico> quimicos;

    
    public void verificar() throws Exception{
        
        if(this.codigo==null || quimicos == null || quimicos.isEmpty() || this.codigo.equals("")) {
            throw new Exception("Error, quimico vacio");
        }
        
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

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Residuo other = (Residuo) obj;
        return Objects.equals(this.quimicos, other.quimicos);
    }
    
    
    
}
