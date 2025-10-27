package racingcar.model;

public class RacingCar {
    private final String carNames;
    private final String[] carNameArray;
    private int[] carScore;

    public RacingCar(String carNames) {
        this.carNames = carNames;
        this.carNameArray = carNames.split(",");
        carScore = new int[carNames.length()];
    }

    public String getCarNames() {
        return carNames;
    }

    public String[] getCarNameArray() {
        return carNameArray;
    }

    public int[] getCarScore() {
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
            carScore[i] += makeMove(randomNumber[i]);
        }
    }
}
