package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "orderTable")
public class Order {

    @Id
    @GeneratedValue
    private Integer id;

    private Timestamp date;

    @ManyToOne
    private UserBasket userBasket;

    private String details;
}
