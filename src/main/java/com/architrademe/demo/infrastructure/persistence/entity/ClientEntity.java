package com.architrademe.demo.infrastructure.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class ClientEntity extends UserEntity {

    public ClientEntity() {}

    public ClientEntity(String name, String surname, String phone, String email, String password) {
        super(name, surname, phone, email, password);
    }

}
