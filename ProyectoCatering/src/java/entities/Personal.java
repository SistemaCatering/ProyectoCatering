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
@Table(name = "personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByCodPerso", query = "SELECT p FROM Personal p WHERE p.codPerso = :codPerso")
    , @NamedQuery(name = "Personal.findByCedulaPerso", query = "SELECT p FROM Personal p WHERE p.cedulaPerso = :cedulaPerso")
    , @NamedQuery(name = "Personal.findByNombrePerso", query = "SELECT p FROM Personal p WHERE p.nombrePerso = :nombrePerso")
    , @NamedQuery(name = "Personal.findByDireccionPerso", query = "SELECT p FROM Personal p WHERE p.direccionPerso = :direccionPerso")
    , @NamedQuery(name = "Personal.findByOrganizPerso", query = "SELECT p FROM Personal p WHERE p.organizPerso = :organizPerso")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_perso")
    private Integer codPerso;
    @Size(max = 20)
    @Column(name = "cedula_perso")
    private String cedulaPerso;
    @Size(max = 30)
    @Column(name = "nombre_perso")
    private String nombrePerso;
    @Size(max = 70)
    @Column(name = "direccion_perso")
    private String direccionPerso;
    @Size(max = 20)
    @Column(name = "organiz_perso")
    private String organizPerso;

    public Personal() {
    }

    public Personal(Integer codPerso) {
        this.codPerso = codPerso;
    }

    public Integer getCodPerso() {
        return codPerso;
    }

    public void setCodPerso(Integer codPerso) {
        this.codPerso = codPerso;
    }

    public String getCedulaPerso() {
        return cedulaPerso;
    }

    public void setCedulaPerso(String cedulaPerso) {
        this.cedulaPerso = cedulaPerso;
    }

    public String getNombrePerso() {
        return nombrePerso;
    }

    public void setNombrePerso(String nombrePerso) {
        this.nombrePerso = nombrePerso;
    }

    public String getDireccionPerso() {
        return direccionPerso;
    }

    public void setDireccionPerso(String direccionPerso) {
        this.direccionPerso = direccionPerso;
    }

    public String getOrganizPerso() {
        return organizPerso;
    }

    public void setOrganizPerso(String organizPerso) {
        this.organizPerso = organizPerso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPerso != null ? codPerso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.codPerso == null && other.codPerso != null) || (this.codPerso != null && !this.codPerso.equals(other.codPerso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Personal[ codPerso=" + codPerso + " ]";
    }
    
}
