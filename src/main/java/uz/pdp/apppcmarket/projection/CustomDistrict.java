package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.District;
import uz.pdp.apppcmarket.entity.Region;


@Projection(types = District.class)
public interface CustomDistrict {
    Integer getId();
    String getName();
    Region getRegion();
}
