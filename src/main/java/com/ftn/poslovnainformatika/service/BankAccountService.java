package com.ftn.poslovnainformatika.service;

import com.ftn.poslovnainformatika.dto.bankAccount.BankAccountInputDTO;
import com.ftn.poslovnainformatika.dto.bankAccount.BankAccountOutputDTO;

import java.util.List;

public interface BankAccountService {

    List<BankAccountOutputDTO> findAll();
    BankAccountOutputDTO create(BankAccountInputDTO newBankAccount);

}
