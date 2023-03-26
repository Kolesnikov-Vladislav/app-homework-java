import front.Front;
import front.LoginFront;
import front.NotesFront;
import repository.FileNotesRepository;
import repository.FileUserRepository;
import session.UserSession;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception {
        new Front(
                new LoginFront(
                        new FileUserRepository(
                                Path.of("users.csv")
                        )
                ),
                new NotesFront(
                        new FileNotesRepository(
                                Path.of("notes.csv")
                        )
                )
        ).start(UserSession.INSTANCE);
    }
}
