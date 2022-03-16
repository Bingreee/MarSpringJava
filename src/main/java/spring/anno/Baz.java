package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Baz {
	
	@Bean
	public Foo activeFoo() {
		System.out.println("Baz.activeFoo()실행");
		Foo smith = new Foo();
		smith.setName("smith");
		return smith;
	}
}
