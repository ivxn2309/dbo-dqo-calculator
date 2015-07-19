package quim.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;
import org.json.simple.JSONObject;

public class Elemento implements Serializable {
    private static final long serialVersionUID = 1L;

    private String simbolo;
    private int numero;
    private String nombre;
    private double peso;
    private String caracter;
    private Collection<Valencia> valenciasCollection;

    public Elemento() {
    }

    public Elemento(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public Elemento(JSONObject json) {
        this.simbolo = (String) json.get("simbolo");
        this.numero = ((Long) json.get("numero")).intValue();
        this.nombre = (String) json.get("nombre");
        this.peso = (Double) json.get("peso");
        this.caracter = (String) json.get("caracter");
    }

    public Elemento(String simbolo, int numero, String nombre, double peso, String caracter) {
        this.simbolo = simbolo;
        this.numero = numero;
        this.nombre = nombre;
        this.peso = peso;
        this.caracter = caracter;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    @XmlTransient
    public Collection<Valencia> getValenciasCollection() {
        return valenciasCollection;
    }

    public void setValenciasCollection(Collection<Valencia> valenciasCollection) {
        this.valenciasCollection = valenciasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (simbolo != null ? simbolo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elemento)) {
            return false;
        }
        Elemento other = (Elemento) object;
        return !((this.simbolo == null && other.simbolo != null) || (this.simbolo != null && !this.simbolo.equals(other.simbolo)));
    }

    @Override
    public String toString() {
        return simbolo;
    }
    
}
