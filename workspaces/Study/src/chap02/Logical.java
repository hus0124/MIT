package chap02;

/*
 * ?Όλ¦¬μ°?°? : A && B, A || B, !A, A & B, A | B,
 * c?Έ?΄??? && ! || λ§? ???€ 
 */
public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int var1 = 20;
		int a;
		int b=10;
		
		boolean flag = ( (a=num) > 11) && ((b=var1) < 20 );
		System.out.println("flag=" + flag + ",a=" + a + ",b=" +b);
		
		flag = ( (a=num) > 11) & ((b=var1) < 20 );
		System.out.println("flag=" + flag + ",a=" + a + ",b=" +b);
        // ?λ°μ μΆκ?? ?Όλ¦? ?°?°? & Aκ°? false ?΄??Ό? Bκ°? true?Έμ§? false?Έμ§? ??¨??€.
		// && Aκ°? false?΄λ©? Bκ°? λ¬΄μ?΄?  ??¨ λ¬΄μ, ?€? ? ?¨.
		
	  }
}
