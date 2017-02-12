public class Filla {

	public static void main(String[] args) {
		int[] i = isFill(new int[] { 1, 2, 3, 5, 9, 12, -2, 6, 6 }, 0, 9);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

	}

	public static int[] isFill(int[] a, int b, int c) {
		int[] d = new int[c];
		int j = 0;
		if(b==0){
			int[] e = new int[0];
			return e;
		}
		for (int i = 0; i < c; i++) {
			d[i] = a[j];
			j++;
			if (j == b) {
				j = 0;
			}
		}
		return d;
	}

}
