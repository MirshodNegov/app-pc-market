package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getNameUz();
    String getNameRu();
    String getNameEng();
    Category getParentCategory();
}
