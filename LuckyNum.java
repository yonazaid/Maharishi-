
public class LuckyNum {

	public static void main(String[] args) {
		String t=isLucky("aeiou");
		System.out.println(t);

	}
	public static String isLucky(String a){
      String newString="";
      for (int i = 0; i < a.length(); i++) {
		if(a.charAt(i)=='a' ||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
			
		}
		else{
			newString=newString+a.charAt(i);
		}
	}
      return newString;
	}

}
