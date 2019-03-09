package pl.alx.debt.model;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "debtor")
@Getter
public class Debtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 45,unique = true)
    private String email;

    private String password;

    @Column(length = 45,nullable = false)
    private String firstName;

    @Column(length = 45,nullable = false)
    private String lastName;


}
