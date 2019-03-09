package pl.alx.debt.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Debt {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private LocalDateTime createdAt;

    private BigDecimal ammount;

    private boolean paidOff;


    @ManyToOne
    @JoinColumn(name= "lander_id")
    private User lender ;


    @ManyToOne
    @JoinColumn(name= "deptor_id")
    private Debtor debtor;

}
