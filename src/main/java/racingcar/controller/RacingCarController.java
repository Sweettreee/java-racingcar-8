package racingcar.controller;

import java.util.ArrayList;
import racingcar.model.RacingCar;
import racingcar.model.RacingGame;
import racingcar.view.Input;

public class RacingCarController {
    RacingCar car;
    RacingGame game;

    public RacingCarController() {
        car = new RacingCar(Input.getCarNames());
        game = new RacingGame(Input.getGameTryNumber());
    }

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

    public void isNameUnderFive() {
        car.isUnderFive();
    }

    public int[] generateNumber() {
        return game.generateRandomNumber(getCarNameArrayLength());
    }

    public void makeMoves(int[] randomNumbers) {
        car.updateCarScores(randomNumbers);
    }

    public void printEachGameResult(ArrayList<Integer> carScores, String[] carNameArray) {
        for (int i = 0; i < carNameArray.length; i++) {
            Input.printEachGameResult(carScores, carNameArray);
        }
    }

    public String getFinalWinner() {
        String[] carNames = getCarArray();
        ArrayList<Integer> carScores = getCarScore();
        return game.getFinalWinner(carNames, carScores);
    }

    public void printFinalWinner(String winners) {
        Input.printFinalWinner(winners);
    }

    public void gameRun() {
        Input.printGameResultMessage();
        isNameUnderFive();
        for (int i = 0; i < getGameTryNumber(); i++) {
            makeMoves(generateNumber());
            Input.printEachGameResult(getCarScore(), getCarArray());
        }
        printFinalWinner(getFinalWinner());
    }
}