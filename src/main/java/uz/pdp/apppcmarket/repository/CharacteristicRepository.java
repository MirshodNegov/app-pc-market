package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Characteristic;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.projection.CustomCharacteristic;
import uz.pdp.apppcmarket.projection.CustomUser;

@RepositoryRestResource(path = "characteristic",collectionResourceRel = "List",excerptProjection = CustomCharacteristic.class)
public interface CharacteristicRepository extends JpaRepository<Characteristic,Integer> {
}
