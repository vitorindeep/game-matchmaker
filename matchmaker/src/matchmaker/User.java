package matchmaker;

/**
 *
 * @author Vitor Castro
 */
public class User {

    private String username;
    private String password;
    private int ranking;

    public User(String user, String pass) {
        username = user;
        password = pass;
        ranking = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getRanking() {
        return ranking;
    }

    public void increaseRanking() {
        if (ranking < 9) {
            ranking++;
        }
    }

    public void decreaseRanking() {
        if (ranking > 0) {
            ranking--;
        }
    }
}
