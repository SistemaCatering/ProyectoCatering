/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
    , @NamedQuery(name = "Evento.findByCodEvento", query = "SELECT e FROM Evento e WHERE e.codEvento = :codEvento")
    , @NamedQuery(name = "Evento.findByFechaEvento", query = "SELECT e FROM Evento e WHERE e.fechaEvento = :fechaEvento")
    , @NamedQuery(name = "Evento.findByMotivoEvento", query = "SELECT e FROM Evento e WHERE e.motivoEvento = :motivoEvento")
    , @NamedQuery(name = "Evento.findByHoraEvento", query = "SELECT e FROM Evento e WHERE e.horaEvento = :horaEvento")
    , @NamedQuery(name = "Evento.findByCodLugar", query = "SELECT e FROM Evento e WHERE e.codLugar = :codLugar")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_evento")
    private Integer codEvento;
    @Column(name = "fecha_evento")
    @Temporal(TemporalType.DATE)
    private Date fechaEvento;
    @Size(max = 20)
    @Column(name = "motivo_evento")
    private String motivoEvento;
    @Column(name = "hora_evento")
    @Temporal(TemporalType.DATE)
    private Date horaEvento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_lugar")
    private int codLugar;

    public Evento() {
    }

    public Evento(Integer codEvento) {
        this.codEvento = codEvento;
    }

    public Evento(Integer codEvento, int codLugar) {
        this.codEvento = codEvento;
        this.codLugar = codLugar;
    }

    public Integer getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(Integer codEvento) {
        this.codEvento = codEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getMotivoEvento() {
        return motivoEvento;
    }

    public void setMotivoEvento(String motivoEvento) {
        this.motivoEvento = motivoEvento;
    }

    public Date getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(Date horaEvento) {
        this.horaEvento = horaEvento;
    }

    public int getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(int codLugar) {
        this.codLugar = codLugar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEvento != null ? codEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.codEvento == null && other.codEvento != null) || (this.codEvento != null && !this.codEvento.equals(other.codEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Evento[ codEvento=" + codEvento + " ]";
    }
    
}
