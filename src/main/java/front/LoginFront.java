package front;

import model.User;
import repository.UserRepository;
import session.UserSession;

import javax.swing.*;
import java.util.NoSuchElementException;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class LoginFront implements FtBase {

    private final UserRepository userRepository;

    public LoginFront(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void start(UserSession userSession) throws Exception {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        String family = JOptionPane.showInputDialog("Family:");
        User user = null;
        try {
            user = userRepository.findAll()
                    .stream()
                    .filter(u -> u.isSameUser(username, password, family))
                    .findAny()
                    .orElseThrow();
        } catch (NoSuchElementException e) {
            JOptionPane.showMessageDialog(null, "User not found :(", "Error", ERROR_MESSAGE);
            start(userSession);
        }
        userSession.setUser(user);
    }
}