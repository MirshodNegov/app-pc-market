package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MyTeam {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String occupation;

    @OneToOne
    private Attachment attachment;
}
