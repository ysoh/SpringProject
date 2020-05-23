package kr.or.happyfam.hello.controller;

import kr.or.happyfam.hello.service.*;

public class HelloController {
	IHelloService helloService = new HelloService();
	
	public void hello(String name) {
		System.out.println("HelloConroller : " + helloService.sayHello(name));
	}
}
