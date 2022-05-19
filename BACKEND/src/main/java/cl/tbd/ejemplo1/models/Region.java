package cl.tbd.ejemplo1.models;

import org.postgis.Geometry;
import org.postgis.PGgeometry;
import org.postgis.Point;

public class Region {
    private Integer gid;
    private String nom_reg;
    // private PGgeometry geom;

    public String getNom_reg() {
        return nom_reg;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer id) {
        this.gid = id;
    }

    public void setNom_reg(String nombre) {
        this.nom_reg = nombre;
    }
    /*
     * public PGgeometry getGeom() {
     * return geom;
     * }
     * 
     * public void setGeom(PGgeometry geom) {
     * this.geom = geom;
     * }
     */
}
