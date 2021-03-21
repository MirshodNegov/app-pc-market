package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Article;
import uz.pdp.apppcmarket.entity.Attachment;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();
    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
