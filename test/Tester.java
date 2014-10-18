import models.GameEngine;
import models.User;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nova on 10/18/2014.
 */
public class Tester {


    @Test
    public void test1() {
        String userName = "Timothy Tim Tim-er-roo";
        GameEngine gameEngine = new GameEngine();
        gameEngine.addRoom(20, "1");
        gameEngine.loginUser(userName);
        User user = gameEngine.mappingOfUsernamesToUsers.get(userName);
        gameEngine.addUserToRoom(user, "1");
        User foundUser = gameEngine.mappingOfUsernamesToUsers.get(userName);
        user.addPointToScore();
        assertEquals(foundUser, user);
        assertEquals(foundUser.getCurrentRoom(), gameEngine.currentRooms.get(0));
        assertEquals(foundUser.getScore(), 1);
        assertEquals(userName, foundUser.getUserName());
    }
}
