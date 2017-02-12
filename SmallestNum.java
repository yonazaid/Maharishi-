
public class SmallestNum {

	public static void main(String[] args) {
	int i =smallNum(624,4);
	System.out.println(i);

	}
public static int smallNum(int n,int p){
	int r=0;
	int count=0;
	int q=0;
	int s=0;
	for(int i=1;i<=p;i++){
		q=n*i;
		count=0;
		while(q>10){
			r=q%10;
			q=q/10;
			if(r==2){
				count++;
			}
		}
		if(q==2){
			count++;
		}
		if(count!=0){
			s++;
		}
	}

	if(s==p){
		return n;
	}
	return 0;
}
}
