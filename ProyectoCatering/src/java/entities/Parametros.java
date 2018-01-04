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
@Table(name = "parametros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametros.findAll", query = "SELECT p FROM Parametros p")
    , @NamedQuery(name = "Parametros.findByCodPa", query = "SELECT p FROM Parametros p WHERE p.codPa = :codPa")
    , @NamedQuery(name = "Parametros.findByRucPa", query = "SELECT p FROM Parametros p WHERE p.rucPa = :rucPa")
    , @NamedQuery(name = "Parametros.findByNombreEmpresaPa", query = "SELECT p FROM Parametros p WHERE p.nombreEmpresaPa = :nombreEmpresaPa")
    , @NamedQuery(name = "Parametros.findByDireccionPa", query = "SELECT p FROM Parametros p WHERE p.direccionPa = :direccionPa")
    , @NamedQuery(name = "Parametros.findByTelefonoPa", query = "SELECT p FROM Parametros p WHERE p.telefonoPa = :telefonoPa")
    , @NamedQuery(name = "Parametros.findByWebPa", query = "SELECT p FROM Parametros p WHERE p.webPa = :webPa")
    , @NamedQuery(name = "Parametros.findByPathLogoPa", query = "SELECT p FROM Parametros p WHERE p.pathLogoPa = :pathLogoPa")})
public class Parametros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_pa")
    private Integer codPa;
    @Size(max = 20)
    @Column(name = "ruc_pa")
    private String rucPa;
    @Size(max = 50)
    @Column(name = "nombre_empresa_pa")
    private String nombreEmpresaPa;
    @Size(max = 70)
    @Column(name = "direccion_pa")
    private String direccionPa;
    @Size(max = 20)
    @Column(name = "telefono_pa")
    private String telefonoPa;
    @Size(max = 70)
    @Column(name = "web_pa")
    private String webPa;
    @Size(max = 20)
    @Column(name = "path_logo_pa")
    private String pathLogoPa;

    public Parametros() {
    }

    public Parametros(Integer codPa) {
        this.codPa = codPa;
    }

    public Integer getCodPa() {
        return codPa;
    }

    public void setCodPa(Integer codPa) {
        this.codPa = codPa;
    }

    public String getRucPa() {
        return rucPa;
    }

    public void setRucPa(String rucPa) {
        this.rucPa = rucPa;
    }

    public String getNombreEmpresaPa() {
        return nombreEmpresaPa;
    }

    public void setNombreEmpresaPa(String nombreEmpresaPa) {
        this.nombreEmpresaPa = nombreEmpresaPa;
    }

    public String getDireccionPa() {
        return direccionPa;
    }

    public void setDireccionPa(String direccionPa) {
        this.direccionPa = direccionPa;
    }

    public String getTelefonoPa() {
        return telefonoPa;
    }

    public void setTelefonoPa(String telefonoPa) {
        this.telefonoPa = telefonoPa;
    }

    public String getWebPa() {
        return webPa;
    }

    public void setWebPa(String webPa) {
        this.webPa = webPa;
    }

    public String getPathLogoPa() {
        return pathLogoPa;
    }

    public void setPathLogoPa(String pathLogoPa) {
        this.pathLogoPa = pathLogoPa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPa != null ? codPa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametros)) {
            return false;
        }
        Parametros other = (Parametros) object;
        if ((this.codPa == null && other.codPa != null) || (this.codPa != null && !this.codPa.equals(other.codPa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Parametros[ codPa=" + codPa + " ]";
    }
    
}
