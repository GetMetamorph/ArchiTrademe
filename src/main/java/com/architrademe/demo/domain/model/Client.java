package com.architrademe.demo.domain.model;

public class Client extends User {

    public Client() {}

    public Client(String name, String surname, String phone, String email, String password) {
        super(name, surname, phone, email, password);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", projects=" + super.getProjects() +
                ", password='" + super.getPassword() + '\''+
                '}';
    }
}