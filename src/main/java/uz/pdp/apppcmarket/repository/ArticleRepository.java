package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.Article;
import uz.pdp.apppcmarket.projection.CustomAddress;
import uz.pdp.apppcmarket.projection.CustomArticle;

@RepositoryRestResource(path = "article",collectionResourceRel = "List",excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
