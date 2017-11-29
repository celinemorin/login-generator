package geco;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertThat(loginService.loginExists("PDUR"), is(true));
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertThat(loginService.loginExists("JROL1"), is(true));
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
        loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertThat(loginService.loginExists("PDUR"), is(true));
    }

    @Test
    public void testLoginJROL2() throws Exception {
        LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        String s = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertThat(s, is("JRAL2"));
    }

}