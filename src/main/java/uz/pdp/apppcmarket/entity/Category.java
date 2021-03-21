package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String nameUz;
    private String nameRu;
    private String nameEng;

    @ManyToOne
    private Category parentCategory;

}
