package racingcar.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IOTest {
    protected void systemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    protected final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    protected final PrintStream originalOut = System.out;

    // 캡처 시작
    protected void startCapture() {
        System.setOut(new PrintStream(outputStream));
    }

    // 캡처 종료 및 복구
    protected void stopCapture() {
        System.setOut(originalOut);
    }

    // 캡처된 출력값 반환
    protected String getCapturedOutput() {
        return outputStream.toString();
    }
}
