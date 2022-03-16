package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greeting")
public class GreetingServiceImpl implements GreetingService {
	@Value("AOP 어노테이션 연습")
	private String greeting;

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello(String name) {
		System.out.println("sayHello : "+greeting+" : "+name);

	}

	public void sayGoodbye(String name) throws Exception{
		System.out.println("sayGoodbye : "+greeting+" : "+name);
		throw new Exception("강제 예외 발생");
	}

}
