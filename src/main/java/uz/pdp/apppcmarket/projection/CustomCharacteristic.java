package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Characteristic;

@Projection(types = Characteristic.class)
public interface CustomCharacteristic {
    Integer getId();
    String getName();
    String getType();
}
