package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Foo {
	
	@Autowired
	@Qualifier("tiger")
	Bar bar;
	@Value("scott")
	String name;
	
	public void doFoo() {
		System.out.println(name+" :: Foo.doFoo()실행");
		bar.doBar();
	}
	
	@PostConstruct
	public void start() {
		System.out.println(name+" :: Foo.start()실행");
	}
	@PreDestroy
	public void stop() {
		System.out.println(name+" :: Foo.stop()실행");
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
