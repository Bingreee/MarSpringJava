package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//컨테이너 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//사용할 bean 꺼냄
		Foo f = context.getBean("foo", Foo.class);
		f.doFoo();
		
		context.registerShutdownHook();//컨테이너 강제 종료
		
		/*
		 * Fooo fo = context.getBean("fooo",Fooo.class); fo.doFooo();
		 */
		
		/*
		 * CollectionTest c = context.getBean("col",CollectionTest.class);
		 * System.out.println(c);
		 */
	}

}
