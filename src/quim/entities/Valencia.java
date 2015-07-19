package quim.entities;

import java.io.Serializable;
import org.json.simple.JSONObject;

public class Valencia implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idValencia;
    private Integer valor;
    private Elemento elemento;

    public Valencia() {
    }

    public Valencia(Long idValencia) {
        this.idValencia = idValencia;
    }
    
    public Valencia(JSONObject json) {
        this.idValencia = (Long) json.get("idValencia");
        this.valor = (Integer) json.get("valor");
        this.elemento = (Elemento) json.get("elemento");
    }

    public Long getIdValencia() {
        return idValencia;
    }

    public void setIdValencia(Long idValencia) {
        this.idValencia = idValencia;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValencia != null ? idValencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valencia)) {
            return false;
        }
        Valencia other = (Valencia) object;
        return !((this.idValencia == null && other.idValencia != null) || (this.idValencia != null && !this.idValencia.equals(other.idValencia)));
    }

    @Override
    public String toString() {
        return valor.toString();
    }
    
}
