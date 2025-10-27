package racingcar.controller;

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

    public int getGameTryNumber() {
        return game.getGameTryNumber();
    }

    public int getCarNameArrayLength() {
        return car.getCarNameArray().length;
    }

    public boolean isNameUnderFive() {
        return car.isUnderFive();
    }

    public int[] generateNumber() {
        return game.generateRandomNumber(getCarNameArrayLength());
    }

    public void makeMoves() {

    }

    public void gameRun() {

    }
}