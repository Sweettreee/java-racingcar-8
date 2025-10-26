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
}
