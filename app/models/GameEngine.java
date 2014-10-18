package models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nova on 10/18/2014.
 */
public class GameEngine {
    public ArrayList<Room> currentRooms;
    public HashMap<String, User> mappingOfUsernamesToUsers;

    public GameEngine() {
        currentRooms = new ArrayList<Room>();
        mappingOfUsernamesToUsers = new HashMap<String, User>();
    }

    /**
     * Creates a room object and loads it into the list of currently available rooms
     *
     * @param pointsNeededToWin The amount of points needed to win the game for the room that will be created
     */
    public void addRoom(int pointsNeededToWin, String roomName) {
        Room room = new Room(pointsNeededToWin, roomName);
        currentRooms.add(room);
    }

    public void loginUser(String userName) {
        User user = new User(userName);
        this.mappingOfUsernamesToUsers.put(userName, user);
    }

    public void addUserToRoom(User user, String roomName) {
        for (Room room : currentRooms) {
            if (room.getRoomName().equals(roomName)) {
                user.joinRoom(room);
                return;
            }
        }
    }

}
