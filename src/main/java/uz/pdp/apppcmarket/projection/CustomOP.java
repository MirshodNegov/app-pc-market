package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.OutputProduct;
import uz.pdp.apppcmarket.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOP {
    Integer getId();
    Product getProduct();
    String getAmount();
}
