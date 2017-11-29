package geco;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by mrc1144a on 29/11/2017.
 */
public class PasswordGenerationTest {
    @Test
    public void randomPassword() throws Exception {
        String mdp = (new PasswordGeneration()).randomPassword();
        assertThat(mdp.length(), is(8));
    }

}