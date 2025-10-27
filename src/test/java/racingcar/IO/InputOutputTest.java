package racingcar.IO;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.Console;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.controller.RacingCarController;

public class InputOutputTest extends IOTest {
    RacingCarController racingCarController;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        systemIn("car1,car2,car3\n3\n");
        startCapture();
        racingCarController = new RacingCarController();
    }

    @AfterEach
    void closeConsole() {
        Console.close();
        stopCapture();
    }

    @Test
    void 입력값_변수로_받기_테스트() {
        // given
        String testString = "car1,car2,car3";
        int testNumber = 3;

        // when
        String carName = racingCarController.getCarNames();
        int gameTryNumber = racingCarController.getGameTryNumber();

        // then
        assertThat(carName).isEqualTo(testString);
        assertThat(gameTryNumber).isEqualTo(testNumber);
    }

    // 고민해 봐야할 점 : 유효하지 않는 입력값의 정의가 무엇일까?
    // 글자 수 5미만 -> 무조건 유효?
    @Test
    void 입력값_유효_테스트() {
        // given
        String testString = "car1,car2,car3";

        // when
        boolean isValidated = racingCarController.isNameUnderFive();

        // then
        assertThat(isValidated).isTrue();
    }

    @Test
    void 구분자파싱_테스트() {
        // given
        String[] testArray = {"car1", "car2", "car3"};

        // when
        String[] simulatedArray = racingCarController.getCarArray();

        // then
        assertThat(simulatedArray).isEqualTo(testArray);
    }

    @Test
    void 자동차이름_시도횟수_실행결과_출력() {
        // given
        String testResult = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n"
                + "car1,car2,car3\n"
                + "시도할 횟수는 몇 회인가요?\n3\n\n실행 결과"
                + "\ncar1 : ---\ncar2 : \ncar3 : -" + System.lineSeparator();

        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(0);
        testList.add(1);

        String[] carNames = {"car1", "car2", "car3"};

        // when
        racingCarController.gameRun();
        racingCarController.printEachGameResult(testList, carNames);

        // then
        assertThat(getCapturedOutput()).isEqualTo(testResult);
    }

    @Test
    void 최종_결과_출력() {

    }
}
