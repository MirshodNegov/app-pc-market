package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.projection.CustomProduct;

import java.util.List;

@RepositoryRestResource(path = "product", collectionResourceRel = "List", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @RestResource(path = "/byName")
    List<Product> findAllByName(@Param("byName") String productName);

    @RestResource(path = "/byModel")
    List<Product> findAllByModel(@Param("byModel") String productModel);

    @RestResource(path = "/byCategory")
    List<Product> findAllByCategory(@Param("byCategory") String productCategory);

    @RestResource(path = "/byPriceBetween")
    List<Product> findAllByPriceBetween(@Param("lowPrice") String lowPrice,
                                        @Param("highPrice") String highPrice);

    @RestResource(path = "/byNameAndModel")
    List<Product> findAllByNameAndModel(@Param("byName") String productName,
                                        @Param("byModel") String productModel);

    @RestResource(path = "/byNameAndModelAndPriceBetween")
    List<Product> findAllByNameAndModelAndPriceBetween(@Param("byName") String productName,
                                                       @Param("byModel") String productModel,
                                                       @Param("lowPrice") String lowPrice,
                                                       @Param("highPrice") String highPrice);
}
