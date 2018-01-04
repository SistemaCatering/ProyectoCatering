/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eduardo
 */
@Entity
@Table(name = "lugar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugar.findAll", query = "SELECT l FROM Lugar l")
    , @NamedQuery(name = "Lugar.findByCodLugar", query = "SELECT l FROM Lugar l WHERE l.codLugar = :codLugar")
    , @NamedQuery(name = "Lugar.findByLocacionLugar", query = "SELECT l FROM Lugar l WHERE l.locacionLugar = :locacionLugar")
    , @NamedQuery(name = "Lugar.findByNombreLugar", query = "SELECT l FROM Lugar l WHERE l.nombreLugar = :nombreLugar")
    , @NamedQuery(name = "Lugar.findByCiudadLugar", query = "SELECT l FROM Lugar l WHERE l.ciudadLugar = :ciudadLugar")
    , @NamedQuery(name = "Lugar.findByDireccionLugar", query = "SELECT l FROM Lugar l WHERE l.direccionLugar = :direccionLugar")
    , @NamedQuery(name = "Lugar.findByCapacidadLugar", query = "SELECT l FROM Lugar l WHERE l.capacidadLugar = :capacidadLugar")
    , @NamedQuery(name = "Lugar.findByCodTl", query = "SELECT l FROM Lugar l WHERE l.codTl = :codTl")})
public class Lugar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_lugar")
    private Integer codLugar;
    @Size(max = 70)
    @Column(name = "locacion_lugar")
    private String locacionLugar;
    @Size(max = 20)
    @Column(name = "nombre_lugar")
    private String nombreLugar;
    @Size(max = 20)
    @Column(name = "ciudad_lugar")
    private String ciudadLugar;
    @Size(max = 20)
    @Column(name = "direccion_lugar")
    private String direccionLugar;
    @Size(max = 10)
    @Column(name = "capacidad_lugar")
    private String capacidadLugar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tl")
    private int codTl;

    public Lugar() {
    }

    public Lugar(Integer codLugar) {
        this.codLugar = codLugar;
    }

    public Lugar(Integer codLugar, int codTl) {
        this.codLugar = codLugar;
        this.codTl = codTl;
    }

    public Integer getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(Integer codLugar) {
        this.codLugar = codLugar;
    }

    public String getLocacionLugar() {
        return locacionLugar;
    }

    public void setLocacionLugar(String locacionLugar) {
        this.locacionLugar = locacionLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getCiudadLugar() {
        return ciudadLugar;
    }

    public void setCiudadLugar(String ciudadLugar) {
        this.ciudadLugar = ciudadLugar;
    }

    public String getDireccionLugar() {
        return direccionLugar;
    }

    public void setDireccionLugar(String direccionLugar) {
        this.direccionLugar = direccionLugar;
    }

    public String getCapacidadLugar() {
        return capacidadLugar;
    }

    public void setCapacidadLugar(String capacidadLugar) {
        this.capacidadLugar = capacidadLugar;
    }

    public int getCodTl() {
        return codTl;
    }

    public void setCodTl(int codTl) {
        this.codTl = codTl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLugar != null ? codLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugar)) {
            return false;
        }
        Lugar other = (Lugar) object;
        if ((this.codLugar == null && other.codLugar != null) || (this.codLugar != null && !this.codLugar.equals(other.codLugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Lugar[ codLugar=" + codLugar + " ]";
    }
    
}
