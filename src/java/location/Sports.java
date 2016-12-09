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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yixxie
 */
@Entity
@Table(name = "sports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sports.findAll", query = "SELECT s FROM Sports s"),
    @NamedQuery(name = "Sports.findByOsmId", query = "SELECT s FROM Sports s WHERE s.osmId = :osmId"),
    @NamedQuery(name = "Sports.findByLeisure", query = "SELECT s FROM Sports s WHERE s.leisure = :leisure"),
    @NamedQuery(name = "Sports.findBySport", query = "SELECT s FROM Sports s WHERE s.sport = :sport")})
public class Sports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "osm_id")
    private Long osmId;
    @Size(max = 2147483647)
    @Column(name = "leisure")
    private String leisure;
    @Size(max = 2147483647)
    @Column(name = "sport")
    private String sport;

    public Sports() {
    }

    public Sports(Long osmId) {
        this.osmId = osmId;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public String getLeisure() {
        return leisure;
    }

    public void setLeisure(String leisure) {
        this.leisure = leisure;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
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
        if (!(object instanceof Sports)) {
            return false;
        }
        Sports other = (Sports) object;
        if ((this.osmId == null && other.osmId != null) || (this.osmId != null && !this.osmId.equals(other.osmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "location.Sports[ osmId=" + osmId + " ]";
    }
    
}
