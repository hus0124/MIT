package chap02;

/*
 * ?°?΄?° ???
 * ? ? : char 2 byte (κ΅?? ?΄ μ§??? ??΄ Unicode UTF-8 λ₯? μ§??.) c?Έ?΄? char? ?λ°μ?? byte ?? κ°λ€.
 * ? ?? 0~2? 16 -1 κΉμ? (??? ??€)
 * long 8 byte ? c?Έ?΄? long long? ???
 * ?€? : c?Έ?΄?? ??Ό(float, double)
 * ?Όλ¦? : μ°?(true)κ³? κ±°μ§(false) -> 1 byte ?¬κΈ?
 */

public class Primitive {		// ?΄??€ ?΄λ¦μ? ??λ¬Έμλ‘? ????€. λ©μ? ?΄λ¦μ? ?λ¬Έμλ‘? ????€.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1 = 0x23;
		// char c1 = '?';
		short s1 = 432;
		int num = 30; 		// default κ°? int
		long ll = 234L; 	// long ?? ???κΈ? ??΄ L? μΆκ? κΈ°μ 
		float f1 = 0.43f;
		double d1 = 0.54;	// defaultκ°? double
		boolean flag = true;	// ?Όλ¦¬ν 1 byte, true or false
		
		System.out.println("b1 = " + b1);
		//System.out.println("c1 = " + c1);
		System.out.println("s1 = " + s1);
		System.out.println("num = " + num);
		System.out.println("ll = " + ll);
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		System.out.println("flag = " + flag);
	
	}

}
