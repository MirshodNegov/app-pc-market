package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserBasket {

    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private OutputProduct outputProduct;
    private Double allSum;
    @OneToOne
    private User user;
}
