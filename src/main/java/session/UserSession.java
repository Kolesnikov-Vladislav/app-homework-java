package session;

import model.User;

public enum UserSession {
    INSTANCE;
    private User user;
    public User getUser() {
        return user;
    }
    public User getFamily() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
