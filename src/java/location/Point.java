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
@Table(name = "point")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Point.findAll", query = "SELECT p FROM Point p"),
    @NamedQuery(name = "Point.findByOsmId", query = "SELECT p FROM Point p WHERE p.osmId = :osmId"),
    @NamedQuery(name = "Point.findByAccess", query = "SELECT p FROM Point p WHERE p.access = :access"),
    @NamedQuery(name = "Point.findByAmenity", query = "SELECT p FROM Point p WHERE p.amenity = :amenity"),
    @NamedQuery(name = "Point.findByHighway", query = "SELECT p FROM Point p WHERE p.highway = :highway"),
    @NamedQuery(name = "Point.findByHistoric", query = "SELECT p FROM Point p WHERE p.historic = :historic"),
    @NamedQuery(name = "Point.findByLeisure", query = "SELECT p FROM Point p WHERE p.leisure = :leisure"),
    @NamedQuery(name = "Point.findByName", query = "SELECT p FROM Point p WHERE p.name = :name"),
    @NamedQuery(name = "Point.findByOffice", query = "SELECT p FROM Point p WHERE p.office = :office"),
    @NamedQuery(name = "Point.findByPublicTransport", query = "SELECT p FROM Point p WHERE p.publicTransport = :publicTransport"),
    @NamedQuery(name = "Point.findByRailway", query = "SELECT p FROM Point p WHERE p.railway = :railway"),
    @NamedQuery(name = "Point.findByReligion", query = "SELECT p FROM Point p WHERE p.religion = :religion"),
    @NamedQuery(name = "Point.findByShop", query = "SELECT p FROM Point p WHERE p.shop = :shop"),
    @NamedQuery(name = "Point.findByTourism", query = "SELECT p FROM Point p WHERE p.tourism = :tourism")})
public class Point implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "osm_id")
    private Long osmId;
    @Size(max = 2147483647)
    @Column(name = "access")
    private String access;
    @Size(max = 2147483647)
    @Column(name = "amenity")
    private String amenity;
    @Size(max = 2147483647)
    @Column(name = "highway")
    private String highway;
    @Size(max = 2147483647)
    @Column(name = "historic")
    private String historic;
    @Size(max = 2147483647)
    @Column(name = "leisure")
    private String leisure;
    @Size(max = 2147483647)
    @Column(name = "name")
    private String name;
    @Size(max = 2147483647)
    @Column(name = "office")
    private String office;
    @Size(max = 2147483647)
    @Column(name = "public_transport")
    private String publicTransport;
    @Size(max = 2147483647)
    @Column(name = "railway")
    private String railway;
    @Size(max = 2147483647)
    @Column(name = "religion")
    private String religion;
    @Size(max = 2147483647)
    @Column(name = "shop")
    private String shop;
    @Size(max = 2147483647)
    @Column(name = "tourism")
    private String tourism;

    public Point() {
    }

    public Point(Long osmId) {
        this.osmId = osmId;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAmenity() {
        return amenity;
    }

    public void setAmenity(String amenity) {
        this.amenity = amenity;
    }

    public String getHighway() {
        return highway;
    }

    public void setHighway(String highway) {
        this.highway = highway;
    }

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
    }

    public String getLeisure() {
        return leisure;
    }

    public void setLeisure(String leisure) {
        this.leisure = leisure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
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

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getTourism() {
        return tourism;
    }

    public void setTourism(String tourism) {
        this.tourism = tourism;
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
        if (!(object instanceof Point)) {
            return false;
        }
        Point other = (Point) object;
        if ((this.osmId == null && other.osmId != null) || (this.osmId != null && !this.osmId.equals(other.osmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "location.Point[ osmId=" + osmId + " ]";
    }
    
}
