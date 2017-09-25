package javagame;

/**
 * Created by Sofiia_Hlushko on 9/25/2017.
 */
public class View {
    public static final String HELLO_WORLD = "Hello world!";
    public static final String GREETING = "Hello, player. Guess a number to win!";
    public static final String CONGRATULATIONS = "Congratulations! You've guessed and the number is ";
    public static final String BOUNDS = "Enter a number in theese bounds: ";
    public static final String WRONG_BOUNDS = "You entered a number out of bounds!";
    public static final String ENTER_NUMBER = "Please, enter a number!";

    public void printMessage(String message) {
        System.out.println(message);
    }

}
