/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Geovanny
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByCodUsu", query = "SELECT u FROM Usuario u WHERE u.codUsu = :codUsu"),
    @NamedQuery(name = "Usuario.findByCedulaUsu", query = "SELECT u FROM Usuario u WHERE u.cedulaUsu = :cedulaUsu"),
    @NamedQuery(name = "Usuario.findByNombreUsu", query = "SELECT u FROM Usuario u WHERE u.nombreUsu = :nombreUsu"),
    @NamedQuery(name = "Usuario.findByDireccionUsu", query = "SELECT u FROM Usuario u WHERE u.direccionUsu = :direccionUsu"),
    @NamedQuery(name = "Usuario.findByTelefonoUsu", query = "SELECT u FROM Usuario u WHERE u.telefonoUsu = :telefonoUsu"),
    @NamedQuery(name = "Usuario.findByCelularUsu", query = "SELECT u FROM Usuario u WHERE u.celularUsu = :celularUsu"),
    @NamedQuery(name = "Usuario.findByEmailUsu", query = "SELECT u FROM Usuario u WHERE u.emailUsu = :emailUsu"),
    @NamedQuery(name = "Usuario.findByContrasenaUsu", query = "SELECT u FROM Usuario u WHERE u.contrasenaUsu = :contrasenaUsu"),
    @NamedQuery(name = "Usuario.findByTipoUsu", query = "SELECT u FROM Usuario u WHERE u.tipoUsu = :tipoUsu")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_usu")
    private Integer codUsu;
    @Size(max = 20)
    @Column(name = "cedula_usu")
    private String cedulaUsu;
    @Size(max = 20)
    @Column(name = "nombre_usu")
    private String nombreUsu;
    @Size(max = 70)
    @Column(name = "direccion_usu")
    private String direccionUsu;
    @Size(max = 20)
    @Column(name = "telefono_usu")
    private String telefonoUsu;
    @Size(max = 20)
    @Column(name = "celular_usu")
    private String celularUsu;
    @Size(max = 70)
    @Column(name = "email_usu")
    private String emailUsu;
    @Size(max = 70)
    @Column(name = "contrasena_usu")
    private String contrasenaUsu;
    @Size(max = 20)
    @Column(name = "tipo_usu")
    private String tipoUsu;

    public Usuario() {
    }

    public Usuario(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public Integer getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public String getCedulaUsu() {
        return cedulaUsu;
    }

    public void setCedulaUsu(String cedulaUsu) {
        this.cedulaUsu = cedulaUsu;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getDireccionUsu() {
        return direccionUsu;
    }

    public void setDireccionUsu(String direccionUsu) {
        this.direccionUsu = direccionUsu;
    }

    public String getTelefonoUsu() {
        return telefonoUsu;
    }

    public void setTelefonoUsu(String telefonoUsu) {
        this.telefonoUsu = telefonoUsu;
    }

    public String getCelularUsu() {
        return celularUsu;
    }

    public void setCelularUsu(String celularUsu) {
        this.celularUsu = celularUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getContrasenaUsu() {
        return contrasenaUsu;
    }

    public void setContrasenaUsu(String contrasenaUsu) {
        this.contrasenaUsu = contrasenaUsu;
    }

    public String getTipoUsu() {
        return tipoUsu;
    }

    public void setTipoUsu(String tipoUsu) {
        this.tipoUsu = tipoUsu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsu != null ? codUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codUsu == null && other.codUsu != null) || (this.codUsu != null && !this.codUsu.equals(other.codUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usuario[ codUsu=" + codUsu + " ]";
    }
    
}
