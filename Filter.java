
public class Filter {

	public static void main(String[] args) {
		boolean i=isFilter(new int[]{1,2,11,6,13,9,7});
		System.out.println(i);


	}
	public static boolean isFilter(int[] a){
		boolean flag9=false;
		boolean flag11=false;
		boolean flag7=false;
		boolean flag13=false;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==9||a[i]==11){
				if(a[i]==9){
					flag9=true;
					
				}
				else{
					flag11=true;
				}
				
			}
			else if(a[i]==7||a[i]==13){
				if(a[i]==7){
					flag7=true;
				}
				else{
					flag13=true;
				}
			}
		}
       if(((flag9 && flag11)||(!flag9 && !flag11))&&((!flag7 && !flag13)||(!flag7 && flag13)||(flag7 && !flag13))){
    	  return true; 
       }
    return false;
	}

}
