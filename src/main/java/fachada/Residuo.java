/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import Excepciones.MalformedResiduo;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alan Rodriguez
 */
public class Residuo {
    
    private String codigo;
    private List<Quimico> quimicos;
    private String nombre;
    
    public void verificar() throws MalformedResiduo{
        if(verificarCodigo() || verificarQuimicos() || verificarNombre()) {
            throw new MalformedResiduo("Error, quimico vacio");
        }
    }
    
    //Verificaciones
    private boolean verificarCodigo() {
        if(this.codigo == null || this.codigo.equalsIgnoreCase("")) {
            return true;
        }
        
        return false;
    }
    
    private boolean verificarQuimicos() {
        if(this.quimicos == null || this.quimicos.isEmpty()) {
            return true;
        }
        return false;
    }
    
    private boolean verificarNombre() {
        if(this.codigo == null || this.codigo.equals("")){
            return true;
        }
        return false;
    }
    //Verificaciones
    
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
