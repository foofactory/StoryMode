package models;

import java.util.HashMap;

/**
 * Created by Nova on 10/18/2014.
 */
public class Room {

    HashMap<String, User> mappingOfUsernamesToUsers;
    String story;

    public Room() {
        mappingOfUsernamesToUsers = new HashMap<String, User>();
        story = "";

    }

    public void addUser(User user) {
        mappingOfUsernamesToUsers.put(user.getUserName(), user);
    }

}
