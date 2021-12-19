package com.ftn.poslovnainformatika.dto.bankAccount;

public class BankAccountInputDTO {

    private String number;
    private Long ownerId;

    public BankAccountInputDTO() {
    }

    public BankAccountInputDTO(String number, Long ownerId) {
        this.number = number;
        this.ownerId = ownerId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}
