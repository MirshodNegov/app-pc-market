package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Detail;
import uz.pdp.apppcmarket.entity.Type;
import uz.pdp.apppcmarket.projection.CustomAddress;

@RepositoryRestResource(path = "type",collectionResourceRel = "TypeList")
public interface TypeRepository extends JpaRepository<Type,Integer> {
}
