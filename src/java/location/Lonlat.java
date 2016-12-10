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
    @NamedQuery(name = "Lonlat.findByOsmId", query = "SELECT l FROM Lonlat l WHERE l.osmId = :osmId"),
    @NamedQuery(name = "Lonlat.findByLon", query = "SELECT l FROM Lonlat l WHERE l.lon = :lon"),
    @NamedQuery(name = "Lonlat.findByLat", query = "SELECT l FROM Lonlat l WHERE l.lat = :lat")})
public class Lonlat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "osm_id")
    private Long osmId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lon")
    private Double lon;
    @Column(name = "lat")
    private Double lat;

    public Lonlat() {
    }

    public Lonlat(Long osmId) {
        this.osmId = osmId;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (osmId != null ? osmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lonlat)) {
            return false;
        }
        Lonlat other = (Lonlat) object;
        if ((this.osmId == null && other.osmId != null) || (this.osmId != null && !this.osmId.equals(other.osmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "location.Lonlat[ osmId=" + osmId + " ]";
    }
    
}
