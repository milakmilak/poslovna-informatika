package com.ftn.poslovnainformatika.service;

import com.ftn.poslovnainformatika.dto.role.RoleOutputDTO;

public interface RoleService {

    RoleOutputDTO findById(Long id);

}
