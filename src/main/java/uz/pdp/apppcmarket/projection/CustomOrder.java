package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Order;
import uz.pdp.apppcmarket.entity.UserBasket;

import java.sql.Timestamp;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
    Timestamp getDate();
    UserBasket getUserBasket();
    String getDetails();
}
