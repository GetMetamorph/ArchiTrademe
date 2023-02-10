package com.architrademe.domain.model;

import java.util.Objects;

public class Client {
    private final long uid = 1L;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public Client(String name, String surname, String email, String phone) {
        this.uid = ++uid; //To automatically generate new UID on Client creation
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Client client = (Client) object;
        return uid == client.uid && java.util.Objects.equals(name, client.name) && java.util.Objects.equals(surname, client.surname) && java.util.Objects.equals(email, client.email) && java.util.Objects.equals(phone, client.phone);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), uid, name, surname, email, phone);
    }


}