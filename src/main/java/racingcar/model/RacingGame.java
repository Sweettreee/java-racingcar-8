package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    private final int GameTryNumber;

    public RacingGame(int gameTryNumber) {
        this.GameTryNumber = gameTryNumber;
    }

    public int getGameTryNumber() {
        return GameTryNumber;
    }

    public int[] generateRandomNumber(int GameTryNumber) {
        int[] randomNumbers = new int[GameTryNumber];
        for (int i = 0; i < GameTryNumber; i++) {
            randomNumbers[i] = Randoms.pickNumberInRange(0, 9);
        }
        return randomNumbers;
    }
}
