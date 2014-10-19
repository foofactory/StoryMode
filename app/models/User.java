package models;
/**
 * Created by eis on 10/18/14.
 */
public class User {
    private String userName;
    private String lastPhraseSubmitted = "";
    private String chosenPhrase = "";
    private int score = 0;
    private boolean isChooser = false;
    private Room currentRoom;
    private String chatMessage = "";
    private boolean hasSubmitted = false;
    public User(String userName) {
        this.userName = userName;
    }
    public void sendChatMessage(String message) {
        chatMessage = message;
//TODO Send this message to the other users in a room
    }
    /**
     * Must set the room of a user before he/she can participate in a game
     *
     * @param room The room that the user has entered
     */
    public void setRoom(Room room) {
        this.currentRoom = room;
    }
    /**
     * Send the phrase specified to the other participants in the room (should be called when a user submits a phrase for a given round)
     *
     * @param phrase The phrase that the user has submitted
     */
    public void submitPhrase(String phrase) {
        lastPhraseSubmitted = phrase;
        hasSubmitted = true;
//TODO
    }
    /**
     * Specifies the phrase that this user has chosen to win the current round
     *
     * @param phrase The phrase that the user has chosen to win the round
     */
    public void choosePhrase(String phrase) {
        if (isChooser) {
            chosenPhrase = phrase;
//TODO push this event to all users in the room this user is in
        }
    }
    /**
     * Increments the score for this user, by 1 point
     */
    public void addPointToScore() {
        score++;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getLastPhraseSubmitted() {
        return lastPhraseSubmitted;
    }
    public void setLastPhraseSubmitted(String lastPhraseSubmitted) {
        this.lastPhraseSubmitted = lastPhraseSubmitted;
    }
    public String getChosenPhrase() {
        return chosenPhrase;
    }
    public void setChosenPhrase(String chosenPhrase) {
        this.chosenPhrase = chosenPhrase;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public boolean isChooser() {
        return isChooser;
    }
    public void setChooser(boolean isChooser) {
        this.isChooser = isChooser;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    public void joinRoom(Room room) {
        room.addUser(this);
    }
}