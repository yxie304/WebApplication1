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
@Table(name = "shop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shop.findAll", query = "SELECT s FROM Shop s"),
    @NamedQuery(name = "Shop.findByOsmId", query = "SELECT s FROM Shop s WHERE s.osmId = :osmId"),
    @NamedQuery(name = "Shop.findByShop", query = "SELECT s FROM Shop s WHERE s.shop = :shop"),
    @NamedQuery(name = "Shop.findByType", query = "SELECT s FROM Shop s WHERE s.type = :type")})
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "osm_id")
    private Long osmId;
    @Size(max = 2147483647)
    @Column(name = "shop")
    private String shop;
    @Size(max = 255)
    @Column(name = "type")
    private String type;

    public Shop() {
    }

    public Shop(Long osmId) {
        this.osmId = osmId;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(object instanceof Shop)) {
            return false;
        }
        Shop other = (Shop) object;
        if ((this.osmId == null && other.osmId != null) || (this.osmId != null && !this.osmId.equals(other.osmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "location.Shop[ osmId=" + osmId + " ]";
    }
    
}
