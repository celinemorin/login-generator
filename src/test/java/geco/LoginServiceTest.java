package geco;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LoginServiceTest {
    @Test
    public void loginExists() throws Exception {
        String[] l = new String[3];
        l[0] = "coucou";
        l[1] = "hello";
        l[2] = "hi";
        LoginService logins = new LoginService(l);
        assertThat(logins.loginExists("coucou"), is(true));
        assertThat(logins.loginExists("tttt"), is(false));
    }

    @Test
    public void addLogin() throws Exception {
        LoginService tmp = new LoginService(new String[0]);
        tmp.addLogin("coucou");
        assertThat(tmp.loginExists("coucou"), is(true));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        String[] l = new String[3];
        l[0] = "coucou";
        l[1] = "hello";
        l[2] = "hi";
        LoginService logins = new LoginService(l);
        List <String> l2 = logins.findAllLoginsStartingWith("h");;
        assertThat(logins.loginExists("hello"), is(true));
        assertThat(logins.loginExists("hi"), is(true));
    }

    @Test
    public void findAllLogins() throws Exception {
        String[] l = new String[3];
        l[0] = "coucou";
        l[1] = "hello";
        l[2] = "hi";
        LoginService logins = new LoginService(l);
        List <String> l2 = logins.findAllLogins();
        assertThat(l2.contains("coucou"), is(true));
        assertThat(l2.contains("hello"), is(true));
        assertThat(l2.contains("hi"), is(true));
        assertThat(l2.contains("h"), is(false));
    }
}