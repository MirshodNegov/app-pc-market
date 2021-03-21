package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.projection.CustomAddress;

@RepositoryRestResource(path = "address",collectionResourceRel = "AddressList",excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
