package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.UserBasket;
import uz.pdp.apppcmarket.projection.CustomAttachment;
import uz.pdp.apppcmarket.projection.CustomUB;

@RepositoryRestResource(path = "userBasket",collectionResourceRel = "List",excerptProjection = CustomUB.class)
public interface UserBasketRepository extends JpaRepository<UserBasket,Integer> {
}
