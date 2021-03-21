package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OutputProduct {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private Product product;

    private String amount;
}
