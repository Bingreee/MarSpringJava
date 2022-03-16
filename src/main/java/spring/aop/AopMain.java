package spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("aopTest.xml");

		GreetingService greeting = context.getBean("greeting",GreetingService.class);
		
		greeting.sayHello("bsh");
		try {
			greeting.sayGoodbye("bsh2");
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
	}

}
