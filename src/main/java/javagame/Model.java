package javagame;

import java.util.Random;

/**
 * Created by Sofiia_Hlushko on 9/25/2017.
 */
public class Model {
    private String value = "";
    private Integer secretNumber;

    {
        Random random = new Random();
        secretNumber = random.nextInt(101);
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getSecretNumber() {
        return this.secretNumber;
    }

}
