package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Detail;
import uz.pdp.apppcmarket.projection.CustomAddress;

@RepositoryRestResource(path = "detail",collectionResourceRel = "DetailList")
public interface DetailRepository extends JpaRepository<Detail,Integer> {
}
