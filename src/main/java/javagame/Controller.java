package javagame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.printMessage(View.GREETING);
//        view.printMessage(model.getSecretNumber().toString());
        Scanner scanner = new Scanner(System.in);
        read(scanner);
        view.printMessage(View.CONGRATULATIONS + model.getSecretNumber());
    }

    private void read(Scanner scanner) {
        view.printMessage(View.BOUNDS + model.getMinValue() + " " + model.getMaxValue());
        try {
            Integer number = readNumber(scanner);
            if (number.equals(model.getSecretNumber())) {
                return;
            } else {
                changeBounds(number);
                read(scanner);
            }
        } catch (NumberOutOfBoundsException e) {
            view.printMessage(e.getMessage());
            read(scanner);
        } catch (InputMismatchException e) {
            view.printMessage(View.ENTER_NUMBER);
            scanner.nextLine();
            read(scanner);
        }
    }

    private Integer readNumber(Scanner scanner) throws NumberOutOfBoundsException {
        Integer tempNumber = scanner.nextInt();
        if (tempNumber >= model.getMinValue() && tempNumber <= model.getMaxValue()) {
            return tempNumber;
        } else {
            throw new NumberOutOfBoundsException(View.WRONG_BOUNDS);
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
