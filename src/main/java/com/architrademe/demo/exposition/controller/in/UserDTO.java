package com.architrademe.demo.exposition.controller.in;


import com.architrademe.demo.domain.model.User;

public class UserDTO {
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User toDomainModel() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        return user;
    }
}
