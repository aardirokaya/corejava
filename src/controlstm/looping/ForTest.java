package controlstm.looping;

public class ForTest {

	public static void main(String[] args) {
		
		int a = 1, b=4;
		for(;a<b; a++,b--){
			
			System.out.println(a);
			System.out.println(b);
		}
		
		

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);

	}

}
