package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Attachment;
import uz.pdp.apppcmarket.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "List",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
