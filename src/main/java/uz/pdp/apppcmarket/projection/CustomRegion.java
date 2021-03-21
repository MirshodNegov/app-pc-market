package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Region;

@Projection(types = Region.class)
public interface CustomRegion {
    Integer getId();
    String getName();
}
