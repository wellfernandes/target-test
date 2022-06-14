package model;

public class Fibonacci {

	public boolean fiboCheck(Integer number) {

		int currentState = 0;
		int previousState = 0;

		for (int i = 1; i <= number; i++) {

			if (i == 1) {
				currentState = 1;
				previousState = 0;
			} else {
				currentState += previousState;
				previousState = currentState - previousState;
			}
			if (currentState == number) {
				return true;
			}
			// System.out.println(currentState);
		}
		return false;
	}
}
