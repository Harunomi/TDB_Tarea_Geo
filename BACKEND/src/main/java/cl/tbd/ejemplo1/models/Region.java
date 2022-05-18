package cl.tbd.ejemplo1.models;

import org.postgis.Geometry;
import org.postgis.PGgeometry;
import org.postgis.Point;

public class Region {
    private Integer id;
    private String nombre;
    private PGgeometry geom;

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PGgeometry getGeom() {
        return geom;
    }

    public void setGeom(PGgeometry geom) {
        this.geom = geom;
    }
}
