package p30;

public class ForEx {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,5,8,13,21};
		
		for (int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		
		for (int num : numbers){
			System.out.print(num + " ");
		}
	}

}
