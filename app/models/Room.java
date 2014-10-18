package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Nova on 10/18/2014.
 */
public class Room {

    private HashMap<String, User> mappingOfUsernamesToUsers;
    private String story;
    private int pointsNeededToWin = 0;
    private ArrayList<User> usersOrderedByTurnOrder;
    private String roomName = "";

    /**
     * @param pointsNeededToWin The points that are needed to win a game
     */
    public Room(int pointsNeededToWin, String roomName) {
        mappingOfUsernamesToUsers = new HashMap<String, User>();
        story = "";
        this.pointsNeededToWin = pointsNeededToWin;
        this.roomName = roomName;
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

    public HashMap<String, User> getMappingOfUsernamesToUsers() {
        return mappingOfUsernamesToUsers;
    }

    public void setMappingOfUsernamesToUsers(HashMap<String, User> mappingOfUsernamesToUsers) {
        this.mappingOfUsernamesToUsers = mappingOfUsernamesToUsers;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getPointsNeededToWin() {
        return pointsNeededToWin;
    }

    public void setPointsNeededToWin(int pointsNeededToWin) {
        this.pointsNeededToWin = pointsNeededToWin;
    }

    public ArrayList<User> getUsersOrderedByTurnOrder() {
        return usersOrderedByTurnOrder;
    }

    public void setUsersOrderedByTurnOrder(ArrayList<User> usersOrderedByTurnOrder) {
        this.usersOrderedByTurnOrder = usersOrderedByTurnOrder;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
