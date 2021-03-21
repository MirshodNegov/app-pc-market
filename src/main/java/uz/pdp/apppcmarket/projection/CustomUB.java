package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.OutputProduct;
import uz.pdp.apppcmarket.entity.User;
import uz.pdp.apppcmarket.entity.UserBasket;

@Projection(types = UserBasket.class)
public interface CustomUB {
    Integer getId();
    OutputProduct getOutputProduct();
    Double getAllSum();
    User getUser();
}
