package p300;

public class CallByReference {

	public static void main(String[] args) {
		Entity entity = new Entity();
		entity.value = 1;
		callByReference(entity);
		
		System.out.println("���� : " + entity.value);

	}

	public static void callByReference(Entity entity) {
		entity.value++;
		System.out.println("����sub : " + entity.value);
		
	}

}
