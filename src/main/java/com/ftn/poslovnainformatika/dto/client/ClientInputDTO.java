package com.ftn.poslovnainformatika.dto.client;

public class ClientInputDTO {

    private String firstName;
    private String lastName;
    private String email;

    private Long roleId;

    public ClientInputDTO() {
    }

    public ClientInputDTO(String firstName, String lastName, String email, Long roleId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roleId = roleId;
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
