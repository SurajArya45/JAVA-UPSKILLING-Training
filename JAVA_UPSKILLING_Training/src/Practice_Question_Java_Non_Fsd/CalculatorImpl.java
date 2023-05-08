package Practice_Question_Java_Non_Fsd;

interface Calculator{
	 //void switchOn();
	int substract(int i1,int i2);
}
public class CalculatorImpl {
		

	public static void main(String[] args) {
		/*
		 * Calculator calculator=() -> System.out.println("Switch On");
		 * calculator.switchOn();
		 */
		Calculator calculator=( i1, i2) -> {
			if (i2<i1)
			{
				throw new RuntimeException("i2 must be greater than i1");
			}		else {
				return i2-i1;
			}
		};
		System.out.println(calculator.substract(833, 20));
}}
//  ()    ->    {body};