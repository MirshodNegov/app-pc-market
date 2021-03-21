package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Comments;
import uz.pdp.apppcmarket.projection.CustomAddress;
import uz.pdp.apppcmarket.projection.CustomComments;

@RepositoryRestResource(path = "comments",collectionResourceRel = "List",excerptProjection = CustomComments.class)
public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}
