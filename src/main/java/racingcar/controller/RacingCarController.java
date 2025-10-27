package racingcar.controller;

import java.util.ArrayList;
import racingcar.model.RacingCar;
import racingcar.model.RacingGame;
import racingcar.view.Input;

public class RacingCarController {
    RacingCar car = new RacingCar(Input.getCarNames());
    RacingGame game = new RacingGame(Input.getGameTryNumber());

    public String getCarNames() {
        return car.getCarNames();
    }

    public String[] getCarArray() {
        return car.getCarNameArray();
    }

    public int getCarNameArrayLength() {
        return car.getCarNameArray().length;
    }

    public int getGameTryNumber() {
        return game.getGameTryNumber();
    }

    public ArrayList<Integer> getCarScore() {
        return car.getCarScore();
    }

    public boolean isNameUnderFive() {
        return car.isUnderFive();
    }

    public int[] generateNumber() {
        return game.generateRandomNumber(getCarNameArrayLength());
    }

    public void makeMoves(int[] randomNumbers) {
        car.updateCarScores(randomNumbers);
    }

    public ArrayList<String> getFinalWinner(String[] carNames, ArrayList<Integer> carScores) {
        return game.getFinalWinner(carNames, carScores);
    }

    public String concatWinners() {
        return game.concatWinners();
    }

    public void printGameResultMessage() {
        Input.printGameResultMessage();
    }

    public void printEachGameResult(ArrayList<Integer> carScores, String[] carNames) {
        for (int i = 0; i < 1; i++) {
            Input.printEachGameResult(carScores, carNames);
        }
    }

    public void gameRun() {
        Input.printQuestionCarNames();
        Input.printCarNames(getCarArray());
        Input.printQuestionGameTryNumber();
        Input.printGameTryNumber(getGameTryNumber());
        Input.printGameResultMessage();
    }
}