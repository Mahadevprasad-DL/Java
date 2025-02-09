package util;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
			int[] numbers ={1, 2, 3, 4, 5};
			System.out.println(numbers[6]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Out Of Bound Error");
			} finally {
				System.out.println("Get output");
			}
	}

}
