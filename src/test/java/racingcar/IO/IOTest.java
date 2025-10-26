package racingcar.IO;

import java.io.ByteArrayInputStream;

public class IOTest {
    protected void systemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}
