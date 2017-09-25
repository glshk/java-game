package javagame;

/**
 * Created by Sofiia_Hlushko on 9/25/2017.
 */
public class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.printMessage(view.GREETING);
        readNumber();
        view.printMessage(view.CONGRATULATIONS + model.getSecretNumber());
    }

    private void readNumber() {
        //read number
        //if ==
        ////return;
        //else
        ////readNumber();
    }
}
