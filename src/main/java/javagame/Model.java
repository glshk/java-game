package javagame;

import java.util.Random;

public class Model {
    private String stringValue = "";
    private Integer secretNumber;
    private Integer minValue = 0;
    private Integer maxValue = 100;

    {
        Random random = new Random();
        secretNumber = random.nextInt(101);
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public void setStringValue(String value) {
        this.stringValue = value;
    }

    public Integer getSecretNumber() {
        return this.secretNumber;
    }

    private void setSecretNumber(Integer number) {
        this.secretNumber = number;
    }

    public Integer getMinValue() {
        return this.minValue;
    }

    public void setMinValue(Integer value) {
        this.minValue = value;
    }

    public Integer getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(Integer value) {
        this.maxValue = value;
    }



}
