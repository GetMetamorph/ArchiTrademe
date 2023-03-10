package com.architrademe.demo.domain.event;

import com.architrademe.demo.domain.model.Client;
import org.springframework.context.ApplicationEvent;

public class ClientEvent extends ApplicationEvent {

    private Client client;

    public ClientEvent(Object source, Client client) {
        super(source);
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
