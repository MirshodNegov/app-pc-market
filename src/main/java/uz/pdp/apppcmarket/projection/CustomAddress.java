package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Address;
import uz.pdp.apppcmarket.entity.District;

@Projection(types = Address.class)
public interface CustomAddress {
     Integer getId();
     String getStreet();
     String getHomeNumber();
     District getDistrict();
}
