package com.ftn.poslovnainformatika.service;

import com.ftn.poslovnainformatika.dto.client.ClientInputDTO;
import com.ftn.poslovnainformatika.dto.client.ClientOutputDTO;

import java.util.List;

public interface ClientService {

    List<ClientOutputDTO> findAll();
    ClientOutputDTO create(ClientInputDTO newClient);

}
