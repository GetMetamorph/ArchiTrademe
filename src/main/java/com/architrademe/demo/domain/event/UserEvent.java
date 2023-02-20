package com.architrademe.demo.domain.event;

import com.architrademe.demo.domain.model.User;
import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {
    private User user;
    private String message;

    public UserEvent(Object source, User user, String message) {
        super(source);
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
