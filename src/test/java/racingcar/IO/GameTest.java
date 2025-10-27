package racingcar.IO;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
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
        // given

        // when
        int[] simulatedNumber = racingCarController.generateNumber();

        // then
        for (int i = 0; i < simulatedNumber.length; i++) {
            assertThat(simulatedNumber[i]).isBetween(0, 9);
        }
    }

    @Test
    void 전진_테스트_및_레이싱카_점수_업데이트() {
        // given
        int[] testNumber = {4, 7, 1};
        int testScore = 1;

        // when
        racingCarController.makeMoves(testNumber);
        ArrayList<Integer> simulatedNumber = racingCarController.getCarScore();

        // then
        assertThat(simulatedNumber.getFirst()).isEqualTo(testScore);
    }

    // 실패하면 -1 반환
    @Test
    void 최종_우승자_선정_테스트() {
        // given
        ArrayList<Integer> testScore = new ArrayList<>();
        testScore.add(3);
        testScore.add(3);
        testScore.add(2);
        String[] testNames = {"car1", "car2", "car3"};
        String testResult = "car1, car2";

        // when
        String Winners = racingCarController.getFinalWinner(testNames, testScore);

        // then
        assertThat(Winners)
                .isNotEmpty()
                .isEqualTo(testResult);
    }
}
