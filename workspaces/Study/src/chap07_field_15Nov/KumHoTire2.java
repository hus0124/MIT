package chap07_field_15Nov;

public class KumHoTire2 extends Tire {
	// 디폴트 생성자가 필요하다. 부모의 생성자를 호출.
	public KumHoTire2(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation){
			System.out.println(location + "KumHoTire 수명 :" + (maxRotation-accumulatedRotation));
		return true;
		}
		else{
			System.out.println(location + "KumHoTire 펑크 ***");
			return false;
		}
	}

}
