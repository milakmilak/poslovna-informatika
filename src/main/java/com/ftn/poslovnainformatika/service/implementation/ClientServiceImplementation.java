package com.ftn.poslovnainformatika.service.implementation;

import com.ftn.poslovnainformatika.dto.client.ClientInputDTO;
import com.ftn.poslovnainformatika.dto.client.ClientOutputDTO;
import com.ftn.poslovnainformatika.model.Client;
import com.ftn.poslovnainformatika.model.Role;
import com.ftn.poslovnainformatika.repository.ClientRepository;
import com.ftn.poslovnainformatika.repository.RoleRepository;
import com.ftn.poslovnainformatika.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImplementation implements ClientService {

    private final ClientRepository repository;
    private final RoleRepository roleRepository;
    private final ModelMapper mapper;

    public ClientServiceImplementation(ClientRepository repository, RoleRepository roleRepository, ModelMapper mapper) {
        this.repository = repository;
        this.roleRepository = roleRepository;
        this.mapper = mapper;
    }

    @Override
    public List<ClientOutputDTO> findAll() {
        return repository.findAll().stream()
                .map(client -> mapper.map(client, ClientOutputDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ClientOutputDTO create(ClientInputDTO newClient) {
        Client forCreation = new Client();

        forCreation.setFirstName(newClient.getFirstName());
        forCreation.setLastName(newClient.getLastName());
        forCreation.setEmail(newClient.getEmail());
        forCreation.setRole(roleRepository.findById(newClient.getRoleId()).get());

        return mapper.map(forCreation, ClientOutputDTO.class);
    }
}
