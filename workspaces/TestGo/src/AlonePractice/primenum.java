package AlonePractice;

public class primenum {

	public static void main(String[] args) {
		
		
		for(int i=2;i<21;i++) {
			int flag=0;
			
			for(int j =2; j<i;j++) {
			if(i%j==0)
				flag=1;
			}
			
		if(flag!=1)
			System.out.println(i);
		
			}
		}
	}
