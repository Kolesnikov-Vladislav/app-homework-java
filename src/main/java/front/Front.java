package front;

import session.UserSession;

public class Front implements FtBase {
    private final FtBase[] frontParts;

    public Front(FtBase... frontParts) {
        this.frontParts = frontParts;
    }

    @Override
    public void start(UserSession userSession) throws Exception {
        for (FtBase front : frontParts) {
            front.start(userSession);
        }
    }
}
