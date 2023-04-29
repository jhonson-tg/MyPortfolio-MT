package com.mrj33.myportfoliomt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class MyportfolioMtApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyportfolioMtApplication.class, args);
	}

}
