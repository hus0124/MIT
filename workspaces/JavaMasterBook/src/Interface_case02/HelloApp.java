package Interface_case02;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : HelloApp.java
//  @ Date : 2019-12-03
//  @ Author : 
//
//




public class HelloApp {
	public static void main(String[] args) {
		MessageBean bean1 = new MessageBeanKr();
		bean1.sayHello("�浿");
		
		MessageBean bean2 = new MessageBeanEn();
		bean2.sayHello("Gil Dong");
	}
}
