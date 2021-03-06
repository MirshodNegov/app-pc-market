package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "userTable")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String fullName;

    private String email;

    private String password;

    @OneToOne
    private Address address;
}
