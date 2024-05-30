package org.example.mapstructwithteacher.dto;

import lombok.Builder;
import org.example.mapstructwithteacher.domain.Address;


@Builder
public class ClientDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Address location;

    public ClientDTO(Long id, String firstname, String lastname, String email, Address location) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.location = location;
    }

    public ClientDTO() {
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Address getLocation() {
        return location;
    }
}
