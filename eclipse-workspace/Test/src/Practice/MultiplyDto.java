package Practice;

public class MultiplyDto {

	private int firstNumber;
	private int secondNumber;

	// 생성자
	public MultiplyDto() {
		this.firstNumber = 1;
		this.secondNumber = 1;
	}

	// 생성자2
	public MultiplyDto(int firstNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = 3;
	}

	public MultiplyDto(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	// 오버로딩 - 함수명은 같고 변수가 다를 때
	// 오버라이딩 - 클래스가 다른 클래스를 상속 받을 때

	public int multiply() {
		return firstNumber * secondNumber;
	}

	// getter - private 으로 정의되어 있는 class 내부 필드를 외부에서 접근 가능하도록 하는 메소드

	public int getFirstNumber() {
		return this.firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return this.secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}
