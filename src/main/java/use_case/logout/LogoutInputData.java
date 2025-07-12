package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    // Username of user who is logging out (cannot be null once set).
    private String username;

    public LogoutInputData(String username) {
        this.username = username;
    }

    /**
     * Returns username
     * @return a string
     * */
    public String getUsername() {
        return username;
    }
}

