
public class Anagram {
   public static void main(String[] args){
    	      
  int i = isAnagram(new char[]{'p','o','o','l'},new char[]{'p','o','l','p'});
          System.out.println(i);      
       }
  public static int isAnagram(char[] a,char[] b){
	  int cnt=0;
	  int cnt2=0;
	  
	  for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			if(a[i]==a[j]){
				cnt++;
			}
			if(a[i]==b[j]){
				cnt2++;
			}
		}
		if(cnt!=cnt2){
			return 0;
		}
	}
	  
	  return 1;
	  
  }
}
