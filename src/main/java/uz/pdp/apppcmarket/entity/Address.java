package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String street;

    private String homeNumber;

    @ManyToOne
    private District district;
}
