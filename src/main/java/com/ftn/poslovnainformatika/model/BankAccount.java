package com.ftn.poslovnainformatika.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount extends BaseEntity {

    private String number;
    private Double balance = 0D;

    @ManyToOne
    private Client owner;

    public BankAccount() {
        super();
    }

    public BankAccount(String number, Double balance, Client owner) {
        super();
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
