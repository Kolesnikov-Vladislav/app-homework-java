package model;

public record User(String username, String password, String family) {

    public boolean isSameUser(String username, String password, String family) {
        return this.username.equals(username) && this.password.equals(password) && this.family.equals(family);
    }
}