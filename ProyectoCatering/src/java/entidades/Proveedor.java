/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
 * @author Geovanny
 */
@Entity
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByCodProve", query = "SELECT p FROM Proveedor p WHERE p.codProve = :codProve"),
    @NamedQuery(name = "Proveedor.findByRucProve", query = "SELECT p FROM Proveedor p WHERE p.rucProve = :rucProve"),
    @NamedQuery(name = "Proveedor.findByNombreProve", query = "SELECT p FROM Proveedor p WHERE p.nombreProve = :nombreProve"),
    @NamedQuery(name = "Proveedor.findByDireccionProve", query = "SELECT p FROM Proveedor p WHERE p.direccionProve = :direccionProve"),
    @NamedQuery(name = "Proveedor.findByTelefonoCasaProve", query = "SELECT p FROM Proveedor p WHERE p.telefonoCasaProve = :telefonoCasaProve"),
    @NamedQuery(name = "Proveedor.findByTelefonoCelularProve", query = "SELECT p FROM Proveedor p WHERE p.telefonoCelularProve = :telefonoCelularProve"),
    @NamedQuery(name = "Proveedor.findByContactoProve", query = "SELECT p FROM Proveedor p WHERE p.contactoProve = :contactoProve"),
    @NamedQuery(name = "Proveedor.findBySectorProve", query = "SELECT p FROM Proveedor p WHERE p.sectorProve = :sectorProve"),
    @NamedQuery(name = "Proveedor.findByCorreoProve", query = "SELECT p FROM Proveedor p WHERE p.correoProve = :correoProve"),
    @NamedQuery(name = "Proveedor.findByTransporteProve", query = "SELECT p FROM Proveedor p WHERE p.transporteProve = :transporteProve")})
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_prove")
    private Integer codProve;
    @Size(max = 20)
    @Column(name = "ruc_prove")
    private String rucProve;
    @Size(max = 30)
    @Column(name = "nombre_prove")
    private String nombreProve;
    @Size(max = 70)
    @Column(name = "direccion_prove")
    private String direccionProve;
    @Size(max = 20)
    @Column(name = "telefono_casa_prove")
    private String telefonoCasaProve;
    @Size(max = 20)
    @Column(name = "telefono_celular_prove")
    private String telefonoCelularProve;
    @Size(max = 30)
    @Column(name = "contacto_prove")
    private String contactoProve;
    @Size(max = 70)
    @Column(name = "sector_prove")
    private String sectorProve;
    @Size(max = 70)
    @Column(name = "correo_prove")
    private String correoProve;
    @Size(max = 18)
    @Column(name = "transporte_prove")
    private String transporteProve;

    public Proveedor() {
    }

    public Proveedor(Integer codProve) {
        this.codProve = codProve;
    }

    public Integer getCodProve() {
        return codProve;
    }

    public void setCodProve(Integer codProve) {
        this.codProve = codProve;
    }

    public String getRucProve() {
        return rucProve;
    }

    public void setRucProve(String rucProve) {
        this.rucProve = rucProve;
    }

    public String getNombreProve() {
        return nombreProve;
    }

    public void setNombreProve(String nombreProve) {
        this.nombreProve = nombreProve;
    }

    public String getDireccionProve() {
        return direccionProve;
    }

    public void setDireccionProve(String direccionProve) {
        this.direccionProve = direccionProve;
    }

    public String getTelefonoCasaProve() {
        return telefonoCasaProve;
    }

    public void setTelefonoCasaProve(String telefonoCasaProve) {
        this.telefonoCasaProve = telefonoCasaProve;
    }

    public String getTelefonoCelularProve() {
        return telefonoCelularProve;
    }

    public void setTelefonoCelularProve(String telefonoCelularProve) {
        this.telefonoCelularProve = telefonoCelularProve;
    }

    public String getContactoProve() {
        return contactoProve;
    }

    public void setContactoProve(String contactoProve) {
        this.contactoProve = contactoProve;
    }

    public String getSectorProve() {
        return sectorProve;
    }

    public void setSectorProve(String sectorProve) {
        this.sectorProve = sectorProve;
    }

    public String getCorreoProve() {
        return correoProve;
    }

    public void setCorreoProve(String correoProve) {
        this.correoProve = correoProve;
    }

    public String getTransporteProve() {
        return transporteProve;
    }

    public void setTransporteProve(String transporteProve) {
        this.transporteProve = transporteProve;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProve != null ? codProve.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.codProve == null && other.codProve != null) || (this.codProve != null && !this.codProve.equals(other.codProve))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Proveedor[ codProve=" + codProve + " ]";
    }
    
}
