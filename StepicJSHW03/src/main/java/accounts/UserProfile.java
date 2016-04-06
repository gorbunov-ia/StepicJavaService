package accounts;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author gorbunov_ia
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
@Entity
@Table(name = "users")
public class UserProfile implements Serializable {

    //create table if not exists users (id bigint auto_increment, login varchar(256), password varchar(256), primary key (id));
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "login", length = 256)
    private String login;

    @Column(name = "password", length = 256)
    private String pass;

    @SuppressWarnings("UnusedDeclaration")
    public UserProfile() {
    }

    public UserProfile(long id, String login, String pass) {
        this.id = id;
        this.login = login;
        this.pass = pass;
    }

    @SuppressWarnings("UnusedDeclaration")
    public UserProfile(String login, String pass) {
        this.id = -1;
        this.login = login;
        this.pass = pass;
    }

    public UserProfile(String login) {
        this.id = -1;
        this.login = login;
        this.pass = login;
    }

    /*
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setId(Long id) {
        this.id = id;
    }
    */

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public Long getId() {
        return id;
    }
}
