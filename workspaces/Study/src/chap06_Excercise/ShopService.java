package chap06_Excercise;
//exercise 18
public class ShopService {
	private static ShopService instance = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getInstance(){
		return instance;
	}
	

}
