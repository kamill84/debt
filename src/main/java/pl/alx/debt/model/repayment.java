package pl.alx.debt.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class repayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private LocalDateTime createdAt;

    private BigDecimal ammount;

    @ManyToOne
    @JoinColumn(name="debt_id")
    private Debt debt;


}
