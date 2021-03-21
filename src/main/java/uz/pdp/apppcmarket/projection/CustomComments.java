package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Comments;
import uz.pdp.apppcmarket.entity.Product;
import uz.pdp.apppcmarket.entity.User;

@Projection(types = Comments.class)
public interface CustomComments {
    Integer getId();
    String getBody();
    User getUser();
    Product getProduct();
    int getNumberStars();
}
