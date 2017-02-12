public class Complete {

	public static void main(String[] args) {
		int i = isComplete(new int[] { -5, 1, 3, 1, 5, 7, 9 });
		System.out.println(i);

	}

	public static int isComplete(int[] a) {
		int minEven = Integer.MAX_VALUE;
		int maxEven = Integer.MIN_VALUE;
		boolean flag = false;
		boolean flag1 = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				if (a[i] < minEven) {
					flag = true;
					minEven = a[i];
				}
				if (a[i] > minEven) {
					maxEven = a[i];
				}
			}
		}
		for (int i = minEven + 1; i <= maxEven - 1; i++) {
			flag1 = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					flag1 = true;
				}
			}
			if (!flag1) {
				return 0;
			}
		}
		if (minEven == maxEven || !flag) {
			return 0;
		}
		return 1;
	}

}
