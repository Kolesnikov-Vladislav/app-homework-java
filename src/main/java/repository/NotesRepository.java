package repository;
import java.util.List;

public interface NotesRepository {

    void saveNote(String username, String family, String note) throws Exception;

    List<String> getNotesContent(String username, String family) throws Exception;
}