package models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Nova on 10/18/2014.
 */
public class GameEngine {
    Logger logger = Logger.getLogger("Engine");
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

    /**
     * Logs the user into the system
     * @param userName The username of the user in question
     */
    public void loginUser(String userName) {
        User user = new User(userName);
        this.mappingOfUsernamesToUsers.put(userName, user);
        logger.log(Level.INFO, "User: " + userName + " has been logged into the system");
    }

    /**
     * Logs the user out of the system
     * @param userName The username of the user in question
     */
    public void logoutUser(String userName) {
        mappingOfUsernamesToUsers.get(userName).leaveRoom();
        mappingOfUsernamesToUsers.remove(userName);
        logger.log(Level.INFO, "User: " + userName + " has been logged out of the system");
    }

    /**
     * Adds the user to the specified game-room
     * @param user The user to add to the room
     * @param roomName The room to add the user to
     */
    public void addUserToRoom(User user, String roomName) {
        for (Room room : currentRooms) {
            if (room.getRoomName().equals(roomName)) {
                user.joinRoom(room);
                return;
            }
        }
    }
}