package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String model;
    private String description;
    @OneToOne
    private Attachment attachment;
    private Double price;
    @ManyToOne
    private Category category;
    @OneToOne
    private Characteristic characteristic;
    private boolean active;
}
