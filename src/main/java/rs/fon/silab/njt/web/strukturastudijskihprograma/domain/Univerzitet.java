/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Milica
 */
@Entity
@Table(name = "univerzitet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Univerzitet.findAll", query = "SELECT u FROM Univerzitet u")
    , @NamedQuery(name = "Univerzitet.findByUniverzitetId", query = "SELECT u FROM Univerzitet u WHERE u.univerzitetId = :univerzitetId")
    , @NamedQuery(name = "Univerzitet.findByNaziv", query = "SELECT u FROM Univerzitet u WHERE u.naziv = :naziv")
    , @NamedQuery(name = "Univerzitet.findBySediste", query = "SELECT u FROM Univerzitet u WHERE u.sediste = :sediste")})
public class Univerzitet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "univerzitetId")
    private Long univerzitetId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "sediste")
    private String sediste;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "univerzitetId")
    private Collection<Fakultet> fakultetCollection;

    public Univerzitet() {
    }

    public Univerzitet(Long univerzitetId) {
        this.univerzitetId = univerzitetId;
    }

    public Univerzitet(Long univerzitetId, String naziv, String sediste) {
        this.univerzitetId = univerzitetId;
        this.naziv = naziv;
        this.sediste = sediste;
    }

    public Long getUniverzitetId() {
        return univerzitetId;
    }

    public void setUniverzitetId(Long univerzitetId) {
        this.univerzitetId = univerzitetId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSediste() {
        return sediste;
    }

    public void setSediste(String sediste) {
        this.sediste = sediste;
    }

    @XmlTransient
    public Collection<Fakultet> getFakultetCollection() {
        return fakultetCollection;
    }

    public void setFakultetCollection(Collection<Fakultet> fakultetCollection) {
        this.fakultetCollection = fakultetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (univerzitetId != null ? univerzitetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Univerzitet)) {
            return false;
        }
        Univerzitet other = (Univerzitet) object;
        if ((this.univerzitetId == null && other.univerzitetId != null) || (this.univerzitetId != null && !this.univerzitetId.equals(other.univerzitetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Univerzitet[ univerzitetId=" + univerzitetId + " ]";
    }
    
}
