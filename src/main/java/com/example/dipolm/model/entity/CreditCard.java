package com.example.dipolm.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer number;
    @Column
    private Integer pin;
    @Column
    private Integer block;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Account account;
}
