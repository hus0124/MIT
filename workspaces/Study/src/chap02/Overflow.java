package chap02;

/*
 * overflow κ²°κ³Όκ°? ?°μΆν  ? μ£Όμ?  κ²?
 * ?°?°κ²°κ³Όκ°? ???₯κ°??₯? ?? ?κ³λ?? ??΄κ°? κ²½μ°
 */
public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.MAX_VALUE;	//int ?? μ΅λ? ?κ³μΉ
		int b = Integer.MAX_VALUE;
		
		int sum = a + b;
		
		sum = add(a, b);

	}
	// ??±? κ²°κ³Όκ°? ??€? κ²μ ?Ό?  ? ??. μ§μ  ??μ§? λ§κ³  ?¨?λ₯? ?¬?©?΄? κ°??₯? ??¬, ?€λ₯λ?? μ€μ¬?Ό
	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		if(a==Integer.MAX_VALUE && b == Integer.MAX_VALUE){
			System.out.println("κ²°κ³Όκ°μ΄ ?μΉ©λ?€.");
		return -1;	// ??¬λ°μ? ?€λ₯? μ²λ¦¬ κ°??₯?κ²? ?€κ³?
		}
		else
		return a + b;	
	}

}
