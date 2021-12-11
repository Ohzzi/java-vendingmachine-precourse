package vendingmachine.views;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
	private static final String INPUT_CHANGES = "자판기가 보유하고 있는 금액을 입력해 주세요.";

	public static String inputChanges() {
		System.out.println(INPUT_CHANGES);
		return Console.readLine();
	}
}
