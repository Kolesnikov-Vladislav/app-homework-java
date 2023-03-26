package front;

import repository.NotesRepository;
import session.UserSession;

import javax.swing.*;
import java.util.List;

public class NotesFront implements FtBase {
    private final NotesRepository notesRepository;

    public NotesFront(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    @Override
    public void start(UserSession userSession) throws Exception {
        List<String> notesContent;
        notesContent = notesRepository.getNotesContent(userSession.getUser().username(), userSession.getFamily().family());
        JOptionPane.showMessageDialog(null, notesContent.toString(), "Old Notes: ", JOptionPane.INFORMATION_MESSAGE);
        String note = JOptionPane.showInputDialog("Your note:");
        notesRepository.saveNote(note, userSession.getUser().username(), userSession.getFamily().family());
    }
}