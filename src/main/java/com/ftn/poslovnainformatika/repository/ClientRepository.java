package com.ftn.poslovnainformatika.repository;

import com.ftn.poslovnainformatika.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
