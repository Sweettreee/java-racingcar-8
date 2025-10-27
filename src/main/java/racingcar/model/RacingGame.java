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

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
