package prob31to38;

public class Salary {
	String name;
	int salary;
	
	Salary(){}
	Salary(String n, int s){
		name = n;
		salary = s;
	}
	
	void getInformation1(){
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary);
	}
}
