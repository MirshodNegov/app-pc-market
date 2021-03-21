package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    long getSize();
    String getContentType();
}
