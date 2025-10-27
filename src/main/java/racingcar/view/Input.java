package racingcar.view;


import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class Input {
    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public static int getGameTryNumber() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Integer.parseInt(Console.readLine());
    }

    public static void printGameResultMessage() {
        System.out.println("\n실행 결과");
    }

    public static void printFinalWinner(String winner) {
        System.out.print("최종 우승자 : " + winner);
    }

    public static void printEachGameResult(ArrayList<Integer> carScores, String[] carNames) {
        for (int i = 0; i < carNames.length; i++) {
            System.out.print(carNames[i] + " : ");
            for (int j = 0; j < carScores.get(i); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}

