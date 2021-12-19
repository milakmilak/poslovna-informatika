package com.ftn.poslovnainformatika.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    private Role role;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "client"
    )
    private List<BankStatement> statements;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "owner"
    )
    private List<BankAccount> accounts;

    public Client() {
        super();
    }

    public Client(String firstName, String lastName, String email, Role role, List<BankStatement> statements, List<BankAccount> accounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.statements = statements;
        this.accounts = accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<BankStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<BankStatement> statements) {
        this.statements = statements;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }
}
