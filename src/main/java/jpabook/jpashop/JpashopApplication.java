package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		Hello a = new Hello();
		a.setVal("aaa");
		System.out.println(a.getVal());
		SpringApplication.run(JpashopApplication.class, args);
	}

}
