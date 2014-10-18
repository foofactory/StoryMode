package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Nova on 10/18/2014.
 */
public class Room {

    HashMap<String, User> mappingOfUsernamesToUsers;
    String story;
    int pointsNeededToWin = 0;
    ArrayList<User> usersOrderedByTurnOrder;

    /**
     * @param pointsNeededToWin The points that are needed to win a game
     */
    public Room(int pointsNeededToWin) {
        mappingOfUsernamesToUsers = new HashMap<String, User>();
        story = "";
        this.pointsNeededToWin = pointsNeededToWin;
        usersOrderedByTurnOrder = new ArrayList<User>();
    }

    /**
     * Creates a randomized turn order based on the users that are currently in the room
     */
    public void setRandomTurnOrder() {
        usersOrderedByTurnOrder = new ArrayList<User>(mappingOfUsernamesToUsers.values());
        Collections.shuffle(usersOrderedByTurnOrder);
    }

    /**
     * Adds a user to the list of users for this room
     * @param user
     */
    public void addUser(User user) {
        mappingOfUsernamesToUsers.put(user.getUserName(), user);
        user.setCurrentRoom(this);
    }

    public void increaseWinnersScore(String username) {
        User winner = getUser(username);
        winner.addPointToScore();
    }

    private User getUser(String username) {
        return mappingOfUsernamesToUsers.get(username);
    }

}
