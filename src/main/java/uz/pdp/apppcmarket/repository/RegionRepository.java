package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Region;
import uz.pdp.apppcmarket.projection.CustomRegion;

@RepositoryRestResource(path = "region",collectionResourceRel = "RegionsList",excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region,Integer> {
}
