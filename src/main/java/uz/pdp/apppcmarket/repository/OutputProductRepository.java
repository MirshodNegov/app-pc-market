package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.OutputProduct;
import uz.pdp.apppcmarket.projection.CustomAddress;
import uz.pdp.apppcmarket.projection.CustomOP;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "List",excerptProjection = CustomOP.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
