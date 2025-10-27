package racingcar.IO;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.controller.RacingCarController;

public class GameTest extends IOTest {
    RacingCarController racingCarController;

    @BeforeEach
    void setUp() {
        systemIn("car1,car2,car3\n3\n");
        racingCarController = new RacingCarController();
    }

    @Test()
    void 난수생성() {
        int[] simulatedNumber = racingCarController.generateNumber();

        for (int i = 0; i < simulatedNumber.length; i++) {
            assertThat(simulatedNumber[i]).isBetween(0, 9);
        }
    }

    @Test
    void 전진_테스트() {

    }

    @Test()
    void 레이싱카_업데이트_테스트() {

    }

}
