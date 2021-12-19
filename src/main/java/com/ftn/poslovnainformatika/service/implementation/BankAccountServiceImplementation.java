package com.ftn.poslovnainformatika.service.implementation;

import com.ftn.poslovnainformatika.dto.bankAccount.BankAccountInputDTO;
import com.ftn.poslovnainformatika.dto.bankAccount.BankAccountOutputDTO;
import com.ftn.poslovnainformatika.model.BankAccount;
import com.ftn.poslovnainformatika.repository.BankAccountRepository;
import com.ftn.poslovnainformatika.repository.ClientRepository;
import com.ftn.poslovnainformatika.service.BankAccountService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankAccountServiceImplementation implements BankAccountService {

    private final BankAccountRepository repository;
    private final ClientRepository clientRepository;
    private final ModelMapper mapper;

    public BankAccountServiceImplementation(BankAccountRepository repository, ClientRepository clientRepository, ModelMapper mapper) {
        this.repository = repository;
        this.clientRepository = clientRepository;
        this.mapper = mapper;
    }

    @Override
    public List<BankAccountOutputDTO> findAll() {
        return repository.findAll().stream()
                .map(bankAccount -> mapper.map(bankAccount, BankAccountOutputDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public BankAccountOutputDTO create(BankAccountInputDTO newBankAccount) {
        BankAccount forCreation = new BankAccount();

        forCreation.setNumber(newBankAccount.getNumber());
        forCreation.setOwner(clientRepository.findById(newBankAccount.getOwnerId()).get());

        forCreation = repository.save(forCreation);

        return mapper.map(forCreation, BankAccountOutputDTO.class);
    }
}
