package com.ftn.poslovnainformatika.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BankStatement extends BaseEntity {

    @ManyToOne
    private Client client;

    @ManyToOne
    private BankAccount account;

    public BankStatement() {
        super();
    }

    public BankStatement(Client client, BankAccount account) {
        super();
        this.client = client;
        this.account = account;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}
