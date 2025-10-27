package racingcar.model;

import java.util.ArrayList;

public class RacingCar {
    private final String carNames;
    private final String[] carNameArray;
    private ArrayList<Integer> carScore;

    public RacingCar(String carNames) {
        this.carNames = carNames;
        this.carNameArray = carNames.split(",");
        carScore = new ArrayList<>();
        for (int i = 0; i < carNameArray.length; i++) {
            carScore.add(0);
        }
    }

    public String getCarNames() {
        return carNames;
    }

    public String[] getCarNameArray() {
        return carNameArray;
    }

    public ArrayList<Integer> getCarScore() {
        return carScore;
    }

    public boolean isUnderFive() {
        for (String carName : carNameArray) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("글자 수가 5를 넘어 유효하지 않습니다.");
            }
        }
        return true;
    }

    public int makeMove(int num) {
        if (num >= 4) {
            return 1;
        }
        return 0;
    }

    public void updateCarScores(int[] randomNumber) {
        for (int i = 0; i < carNameArray.length; i++) {
            int tmp = carScore.get(i);
            carScore.set(i, makeMove(randomNumber[i]) + tmp);
        }
    }

//    public String getFinalWinner() {
//
//    }
}
