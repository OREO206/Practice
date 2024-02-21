package Practice;

public class Multiplication {

	private int mainNumber;

	public int getMainNumber() {
		return this.mainNumber;
	}

	// return 이 없음 void
	public void setMainNumber(int mainNumber) {
		this.mainNumber = mainNumber;
	}

	public void printMultiplication() {
		System.out.println(mainNumber + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(mainNumber + " * " + i + " = " + mainNumber * i);
		}
	}

}
