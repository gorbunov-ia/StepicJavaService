package accounts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gorbunov_ia
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
public class AccountService {
    private final DBService dbService;
    private final Map<String, UserProfile> sessionIdToProfile;

    public AccountService() {
        dbService = new DBService();
        dbService.printConnectInfo();

        sessionIdToProfile = new HashMap<>();
    }

    public void addNewUser(UserProfile userProfile) {
        long user_id = 0;
        try {
            user_id = dbService.addNewUser(userProfile);
            System.out.println("Пользователю " +userProfile.getLogin() + " присвоен id: " + user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public UserProfile getUserByLogin(String login) {
        try {
            return dbService.getUserByLogin(login);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public UserProfile getUserBySessionId(String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile) {
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public void deleteSession(String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }
}
