package kr.or.happyfam.hello;

import kr.or.happyfam.hello.controller.*;
import kr.or.happyfam.hello.service.*;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//IHelloService helloService = new HelloService();
		HelloController controller = new HelloController();
		controller.hello("홍길동");
	}

}
