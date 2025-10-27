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
    void 난수생성_및_전진_할지말지_정하기_테스트() {
        String[] carNames = {"car1", "car2", "car3"};
        int gameTryNumber = 3;
        ArrayList<Boolean>[] simulatedMoves = racingCarController.makeWholeMoves(gameTryNumber);
        assertThat(simulatedMoves)
                .hasSize(gameTryNumber)
                .isNotEmpty();
    }
}
