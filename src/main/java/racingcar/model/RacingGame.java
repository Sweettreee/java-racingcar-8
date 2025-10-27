package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;

public class RacingGame {
    private final int GameTryNumber;
    private final ArrayList<String> winners = new ArrayList<>();
    private String finalWinner;

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

    public String getFinalWinner(String[] carNames, ArrayList<Integer> carScores) {
        int maxNumber = Collections.max(carScores);
        int maxIndex;
        while (true) {
            maxIndex = carScores.indexOf(maxNumber);
            if (maxIndex == -1) {
                break;
            }
            carScores.set(maxIndex, -1);

            winners.add(carNames[maxIndex]);
        }
        finalWinner = String.join(", ", winners);
        return finalWinner;
    }
}
