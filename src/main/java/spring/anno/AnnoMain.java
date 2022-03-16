package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("annoTest.xml");
		
		Foo f = context.getBean("foo", Foo.class);
		f.doFoo();
		System.out.println("----------------------------------------");
		
		Foo smith = context.getBean("activeFoo",Foo.class);
		smith.doFoo();
		
		System.out.println("----------------------------------------");
		context.registerShutdownHook();

	}

}
