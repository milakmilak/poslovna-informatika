package com.ftn.poslovnainformatika.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role extends BaseEntity {

    private String name;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "role"
    )
    private List<Client> clients;

    public Role() {
        super();
    }

    public Role(String name, List<Client> clients) {
        super();
        this.name = name;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
