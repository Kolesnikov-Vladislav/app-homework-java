package front;

import session.UserSession;

public interface FtBase {
    void start(UserSession session) throws Exception;
}