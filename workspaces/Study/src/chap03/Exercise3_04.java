package chap03;

public class Exercise3_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필수
		int pencilPerStudent = pencils / students;
		System.out.println("학생 한 명이 가지는 연필 수 = " + pencilPerStudent);
		
		int others = pencils % students;
		System.out.println("나눠주고 남은 연필 수 = " + others);

	}

}
