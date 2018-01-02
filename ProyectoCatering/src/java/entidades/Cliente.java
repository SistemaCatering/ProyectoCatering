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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodCli", query = "SELECT c FROM Cliente c WHERE c.codCli = :codCli"),
    @NamedQuery(name = "Cliente.findByCedulaCli", query = "SELECT c FROM Cliente c WHERE c.cedulaCli = :cedulaCli"),
    @NamedQuery(name = "Cliente.findByNombreCli", query = "SELECT c FROM Cliente c WHERE c.nombreCli = :nombreCli"),
    @NamedQuery(name = "Cliente.findByDireccionCli", query = "SELECT c FROM Cliente c WHERE c.direccionCli = :direccionCli"),
    @NamedQuery(name = "Cliente.findByTelefonoCli", query = "SELECT c FROM Cliente c WHERE c.telefonoCli = :telefonoCli"),
    @NamedQuery(name = "Cliente.findByCelularCli", query = "SELECT c FROM Cliente c WHERE c.celularCli = :celularCli"),
    @NamedQuery(name = "Cliente.findByEmailCli", query = "SELECT c FROM Cliente c WHERE c.emailCli = :emailCli")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cli")
    private Integer codCli;
    @Size(max = 20)
    @Column(name = "cedula_cli")
    private String cedulaCli;
    @Size(max = 20)
    @Column(name = "nombre_cli")
    private String nombreCli;
    @Size(max = 70)
    @Column(name = "direccion_cli")
    private String direccionCli;
    @Size(max = 20)
    @Column(name = "telefono_cli")
    private String telefonoCli;
    @Size(max = 20)
    @Column(name = "celular_cli")
    private String celularCli;
    @Size(max = 70)
    @Column(name = "email_cli")
    private String emailCli;

    public Cliente() {
    }

    public Cliente(Integer codCli) {
        this.codCli = codCli;
    }

    public Integer getCodCli() {
        return codCli;
    }

    public void setCodCli(Integer codCli) {
        this.codCli = codCli;
    }

    public String getCedulaCli() {
        return cedulaCli;
    }

    public void setCedulaCli(String cedulaCli) {
        this.cedulaCli = cedulaCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getDireccionCli() {
        return direccionCli;
    }

    public void setDireccionCli(String direccionCli) {
        this.direccionCli = direccionCli;
    }

    public String getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(String telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public String getCelularCli() {
        return celularCli;
    }

    public void setCelularCli(String celularCli) {
        this.celularCli = celularCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCli != null ? codCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCli == null && other.codCli != null) || (this.codCli != null && !this.codCli.equals(other.codCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cliente[ codCli=" + codCli + " ]";
    }
    
}
