package accounts;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * Created by VIRUZ on 06.04.2016.
 */
public class UsersDAO {
    private Session session;

    public UsersDAO(Session session) {
        this.session = session;
    }

    public long insertUser(UserProfile user) throws HibernateException {
        return (Long) session.save(user);
    }

    public UserProfile selectUser(String login) throws HibernateException {
        Criteria criteria = session.createCriteria(UserProfile.class);
        return (UserProfile) criteria.add(Restrictions.eq("login", login)).uniqueResult();
    }

    public UserProfile get(long id) throws HibernateException {
        return (UserProfile) session.get(UserProfile.class, id);
    }

}
