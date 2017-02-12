
public class Henry {

	public static void main(String[] args) {
		int i=1,j=3;
		int p=isHenry(i,j);
		System.out.println(p);

	}
    public static int isHenry(int i,int j){
    	int sum=0;
    	int k=0;
    	int d=0;
    	int n=2;
    	int sumT=0;
    	for(int q=1;q<=100000000;q++){
    		sum=0;
    		for(int p=1;p<n;p++){
        		if(n%p==0){
        			sum=sum+p;
        		}
        	}
    		
        	if(sum==n){
        		d++;
        		if(d==i || d==j){
        			k++;
        			sumT=sumT+n;
        			if(k==2){
            			return sumT;
            		}
        		}
        		
        	}
        	n++;
    	}
    	return sumT;
    }
}
