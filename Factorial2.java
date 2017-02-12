public class Factorial2 {
	public static void main(String[] args) {
		int i = isFact(15);
		System.out.println(i);

	}

	public static int isFact(int a) {

		int j = -10;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				if (i - j != 1) 
					j = i;
				else 
					return 1;
				
			}

		}
		return 0;

	}
}
