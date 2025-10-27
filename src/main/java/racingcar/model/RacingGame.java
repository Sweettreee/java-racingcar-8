package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;

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

    public ArrayList<Boolean>[] makeMoves(int n) {
        ArrayList<Boolean>[] moves = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            moves[i] = new ArrayList<>();
            for (int j = 0; j < GameTryNumber; j++) {
                boolean moveForward = generateRandomNumber() >= 4;
                moves[i].add(moveForward);
            }
        }
        return moves;
    }
}
