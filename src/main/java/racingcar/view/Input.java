package racingcar.view;


import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Input {
    public static void printQuestionCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printQuestionGameTryNumber() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public static String getCarNames() {
        return Console.readLine();
    }

    public static int getGameTryNumber() {
        return Integer.parseInt(Console.readLine());
    }

    public static void printCarNames(String[] carNames) {
        for (int i = 0; i < carNames.length - 1; i++) {
            System.out.print(carNames[i] + ",");
        }
        System.out.println(carNames[carNames.length - 1]);
    }

    public static void printGameTryNumber(int gameTryNumber) {
        System.out.println(gameTryNumber + System.lineSeparator());
    }

    public static void printGameResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printEachGameResult(ArrayList<Integer> carScores, String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            System.out.print(carNames[i] + " : ");
            for (int j = 0; j < carScores.get(i); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

