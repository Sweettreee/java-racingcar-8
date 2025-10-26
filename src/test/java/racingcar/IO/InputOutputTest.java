package racingcar.IO;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.controller.RacingCarController;

public class InputOutputTest extends IOTest {
    RacingCarController racingCarController;

    @BeforeEach
    void setUp() {
        systemIn("car1,car2,car3\n3\n");
        racingCarController = new RacingCarController();
    }

    @AfterEach
    void closeConsole() {
        Console.close();
    }

    @Test
    void 입력값_유효_테스트() {
        // given
        String testString = "car1, car2, car3";
        int testNumber = 3;

        // when
        String carName = racingCarController.getCarNames();
        int gameTryNumber = racingCarController.getGameTryNumber();

        // then
        assertThat(carName).isEqualTo(testString);
        assertThat(gameTryNumber).isEqualTo(testNumber);
    }

    @Test
    void 구분자파싱_테스트() {
        String[] testArray = {"car1", "car2", "car3"};

        String[] simulatedArray = racingCarController.getCarArray();
        assertThat(simulatedArray).isEqualTo(testArray);
    }


    @DisplayName("문자열을 구분자로 나누는 테스트")
    @Test
    void basic() {
        String names = "car1,car2,car3";

        String[] namesArr = names.split(",");

        assertThat(namesArr)
                .isNotEmpty()
                .containsExactlyInAnyOrder("car1", "car2", "car3");
    }
}
