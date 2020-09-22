package ru.toolkas.wicketboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class WicketBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(WicketBootApplication.class, args);
	}

}
