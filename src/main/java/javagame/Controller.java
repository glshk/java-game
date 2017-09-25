package javagame;

import java.util.InputMismatchException;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        read(scanner);
        view.printMessage(view.CONGRATULATIONS + model.getSecretNumber());
    }

    private void read(Scanner scanner) {
//        Integer number = scanner.nextInt();
            view.printMessage(view.BOUNDS + model.getMinValue() + " " + model.getMaxValue());
            view.printMessage(model.getSecretNumber().toString());
            try {
                Integer number = readNumber(scanner);
                if (number == model.getSecretNumber()) {
                    return;
                } else {
                    changeBounds(number);
                    read(scanner);
                }
            } catch (NumberOutOfBoundsException e) {
                view.printMessage(e.getMessage());
                read(scanner);
            } catch (InputMismatchException e) {
                view.printMessage(view.ENTER_NUMBER);
                scanner.nextLine();
                read(scanner);
            }
    }

    private Integer readNumber(Scanner scanner) throws NumberOutOfBoundsException {
                Integer tempNumber = scanner.nextInt();
                if (tempNumber >= model.getMinValue() && tempNumber <= model.getMaxValue()) {
                    return tempNumber;
                } else {
                    throw new NumberOutOfBoundsException(view.WRONG_BOUNDS);
                }
    }

    private void changeBounds(Integer number) {
        if(number < model.getSecretNumber()) {
            model.setMinValue(number);
        }
        if(number > model.getSecretNumber()) {
            model.setMaxValue(number);
        }
    }
}
