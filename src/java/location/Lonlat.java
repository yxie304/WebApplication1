/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yixxie
 */
@Entity
@Table(name = "lonlat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lonlat.findAll", query = "SELECT l FROM Lonlat l"),
    @NamedQuery(name = "Lonlat.findById", query = "SELECT l FROM Lonlat l WHERE l.id = :id"),
    @NamedQuery(name = "Lonlat.findByLon", query = "SELECT l FROM Lonlat l WHERE l.lon = :lon"),
    @NamedQuery(name = "Lonlat.findByLat", query = "SELECT l FROM Lonlat l WHERE l.lat = :lat")})
public class Lonlat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Column(name = "lon")
    private Integer lon;
    @Column(name = "lat")
    private Integer lat;

    public Lonlat() {
    }

    public Lonlat(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lonlat)) {
            return false;
        }
        Lonlat other = (Lonlat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "location.Lonlat[ id=" + id + " ]";
    }
    
}
