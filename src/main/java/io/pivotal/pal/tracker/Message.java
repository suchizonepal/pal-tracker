package io.pivotal.pal.tracker;

import org.springframework.stereotype.Service;

@Service
public class Message {


    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
