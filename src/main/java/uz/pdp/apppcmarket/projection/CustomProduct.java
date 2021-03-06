package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.Category;
import uz.pdp.apppcmarket.entity.Characteristic;
import uz.pdp.apppcmarket.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
    String getName();
    String getModel();
    String getDescription();
    Attachment getAttachment();
    Double getPrice();
    Category getCategory();
    Characteristic getCharacteristic();
    boolean getActive();
}
