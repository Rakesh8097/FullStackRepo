package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hs.service.PassportService;

@SpringBootApplication
public class PassportServiceToPersonApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(PassportServiceToPersonApplication.class, args)){
			PassportService bean = ctx.getBean("passportservice",PassportService.class);
			String passport = bean.createPassport();
			System.out.println(passport);
		};
	}

}
