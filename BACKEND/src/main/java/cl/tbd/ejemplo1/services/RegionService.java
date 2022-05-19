package cl.tbd.ejemplo1.services;

import cl.tbd.ejemplo1.models.Region;
import cl.tbd.ejemplo1.repositories.RegionRepository;

import org.postgis.Geometry;
import org.postgis.PGgeometry;
import org.postgis.Point;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RegionService {

    private final RegionRepository regionRepository;

    RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @GetMapping("/regions")
    public List<Region> getAllRegions() {
        System.out.println("getAllRegions()");
        try {
            List<Region> regions = regionRepository.getAllRegions();
            System.out.println("1");
            for (Region r : regions) {
                System.out.println("ID: " + r.getGid());
                System.out.println("Nombre: " + r.getNom_reg());
                /*
                 * PGgeometry geom = r.getGeom();
                 * Geometry geometry = geom.getGeometry();
                 * 
                 * System.out.println("Point: " + geometry.getValue());
                 */
            }
            System.out.println("2");
            return regions;
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
            return null;
        }

    }

}
