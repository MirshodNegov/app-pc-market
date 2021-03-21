package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.District;
import uz.pdp.apppcmarket.projection.CustomDistrict;

@RepositoryRestResource(path = "district",collectionResourceRel = "DistrictsList",excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District,Integer> {
}
