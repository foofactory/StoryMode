package models;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Iterator;

/**
 * Created by eis on 10/19/14.
 */
public class Message {
    private String text;
    private String user;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Message parse(JsonNode msg) {
        Iterator<String> jsonFields = msg.fieldNames();
        while (jsonFields.hasNext()) {
            String i = jsonFields.next();
            switch(i) {
                case "user":
                    this.setUser(i);
                    break;
                case "text":
                    this.setText(i);
                    break;
            }
        }

        return this;
    }
}
