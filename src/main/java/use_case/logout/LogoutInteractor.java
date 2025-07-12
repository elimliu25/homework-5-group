package use_case.logout;

/**
 * The Logout Interactor.
 */

public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;   // DAO
        this.logoutPresenter      = logoutOutputBoundary;      // Presenter
    }

    @Override
    public void execute(LogoutInputData logoutInputData) {
        String username = logoutInputData.getUsername();
        userDataAccessObject.setCurrentUser(null);
        LogoutOutputData logoutOutputData = new LogoutOutputData(username, false);
        logoutPresenter.prepareSuccessView(logoutOutputData);
    }
}


