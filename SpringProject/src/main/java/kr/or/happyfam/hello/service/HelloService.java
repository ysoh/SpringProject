package kr.or.happyfam.hello.service;

public class HelloService implements IHelloService {
	
	@Override
	public String sayHello(String name) {
		System.out.println("HelloService.sayHello() �޼��� ����");
		String message = "Hello~~~ " + name;
		return message;
	}
}
