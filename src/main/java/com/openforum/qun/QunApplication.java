package com.openforum.qun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.openforum.qun"})
public class QunApplication {

	public static void main(String[] args) {
		SpringApplication.run(QunApplication.class, args);
	}

}
