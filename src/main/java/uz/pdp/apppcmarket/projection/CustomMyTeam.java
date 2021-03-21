package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.entity.MyTeam;

@Projection(types = MyTeam.class)
public interface CustomMyTeam {
    Integer getId();
    String getName();
    String getOccupation();
    Attachment getAttachment();
}
