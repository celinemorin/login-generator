package geco;

import java.util.Random;

/**
 * Created by mrc1144a on 29/11/2017.
 */
public class PasswordGeneration {

    public String randomPassword() {
        Random r = new Random(); // perhaps make it a class variable so you don't make a new one every time
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 8; i++) {
            char c = (char)(r.nextInt((int)(Character.MAX_VALUE)));
            sb.append(c);
        }
        return sb.toString();
    }

}
