package Enum;

public class ClothingInfo_ENUM {
	String code;
	String name;
	String material;
	Season season;
	
	/*int season;
	
	static final int SPRING=1;
	static final int SUMMER=2;
	static final int FALL=3;
	static final int WINTER=4;*/
		
	ClothingInfo_ENUM(String code, String name, String material, Season season) {
		
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	
	}
}
