package com.ftn.poslovnainformatika.service.implementation;

import com.ftn.poslovnainformatika.dto.role.RoleOutputDTO;
import com.ftn.poslovnainformatika.repository.RoleRepository;
import com.ftn.poslovnainformatika.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImplementation implements RoleService {

    private final RoleRepository repository;
    private final ModelMapper mapper;

    public RoleServiceImplementation(RoleRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public RoleOutputDTO findById(Long id) {
        return mapper.map(repository.findById(id), RoleOutputDTO.class);
    }
}
