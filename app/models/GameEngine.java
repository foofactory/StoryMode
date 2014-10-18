package models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nova on 10/18/2014.
 */
public class GameEngine {
    ArrayList<Room> currentRooms;
    HashMap<String, User> mappingOfUsernamesToUsers;

    public GameEngine() {
        currentRooms = new ArrayList<Room>();
        mappingOfUsernamesToUsers = new HashMap<String, User>();
    }

    public void addRoom(int pointsNeededToWin) {
        Room room = new Room(pointsNeededToWin);
        currentRooms.add(room);
    }
}
