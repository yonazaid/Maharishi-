
public class Crazy_Num {

	public static void main(String[] args) {
		int[] i = crazy_num(20);
		System.out.print("{");
		for (int j = 0; j < i.length; j++) {
			if(j==i.length-1){
				System.out.print(i[j]);
			}
			else{
				System.out.print(i[j]+" ,");
			}
		}
          System.out.println("}");

	}
	public static int[] crazy_num(int a){
		int[] b=new int[a];
		int j=0;
		for(int i=1;i< a;i++){
			if(i%3==0||i%5==0){
				b[j]=i;
				j++;
			}
		}
		int[] c=new int[j];
		for (int i = 0; i < c.length; i++) {
			c[i]=b[i];
		}
		return c;
	}
	

}
