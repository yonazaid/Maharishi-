
public class CharacterArray {

	public static void main(String[] args) {
		char[] b=isChara(new char[]{'h','a','p','p','i','n','e','s','s'},0,4,7);
		System.out.println(b);

	}
	public static char[] isChara(char[] a,int b,int c,int d){
		char[] e=new char[3];
		e[0]=a[b];
		e[1]=a[c];
		e[2]=a[d];
		return e;
		
	}

}
