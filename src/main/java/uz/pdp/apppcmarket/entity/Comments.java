package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comments {

    @Id
    @GeneratedValue
    private Integer id;

    private String body;

    @OneToOne
    private User user;

    @OneToOne
    private Product product;

    private int numberStars;
}
