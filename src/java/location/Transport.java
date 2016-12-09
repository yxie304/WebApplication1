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
@Table(name = "transport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transport.findAll", query = "SELECT t FROM Transport t"),
    @NamedQuery(name = "Transport.findByOsmId", query = "SELECT t FROM Transport t WHERE t.osmId = :osmId"),
    @NamedQuery(name = "Transport.findByName", query = "SELECT t FROM Transport t WHERE t.name = :name"),
    @NamedQuery(name = "Transport.findByPublicTransport", query = "SELECT t FROM Transport t WHERE t.publicTransport = :publicTransport"),
    @NamedQuery(name = "Transport.findByRailway", query = "SELECT t FROM Transport t WHERE t.railway = :railway")})
public class Transport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "osm_id")
    private Long osmId;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @Size(max = 2147483647)
    @Column(name = "public_transport")
    private String publicTransport;
    @Size(max = 2147483647)
    @Column(name = "railway")
    private String railway;

    public Transport() {
    }

    public Transport(Long osmId) {
        this.osmId = osmId;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicTransport() {
        return publicTransport;
    }

    public void setPublicTransport(String publicTransport) {
        this.publicTransport = publicTransport;
    }

    public String getRailway() {
        return railway;
    }

    public void setRailway(String railway) {
        this.railway = railway;
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
        if (!(object instanceof Transport)) {
            return false;
        }
        Transport other = (Transport) object;
        if ((this.osmId == null && other.osmId != null) || (this.osmId != null && !this.osmId.equals(other.osmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "location.Transport[ osmId=" + osmId + " ]";
    }
    
}
