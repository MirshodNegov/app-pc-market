package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.MyTeam;
import uz.pdp.apppcmarket.projection.CustomCategory;
import uz.pdp.apppcmarket.projection.CustomMyTeam;

@RepositoryRestResource(path = "myTeam",collectionResourceRel = "List",excerptProjection = CustomMyTeam.class)
public interface MyTeamRepository extends JpaRepository<MyTeam,Integer> {
}
