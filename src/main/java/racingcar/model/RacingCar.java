package racingcar.model;

public class RacingCar {
    private final String carNames;

    private final String[] carNameArray;

    public RacingCar(String carNames) {
        this.carNames = carNames;
        this.carNameArray = carNames.split(",");
    }

    public String getCarNames() {
        return carNames;
    }

    public String[] getCarNameArray() {
        return carNameArray;
    }

    public boolean isUnderFive() {
        for (String carName : carNameArray) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException("글자 수가 5를 넘어 유효하지 않습니다.");
            }
        }
        return true;
    }
}
