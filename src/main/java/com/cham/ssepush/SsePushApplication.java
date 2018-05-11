package com.cham.ssepush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SsePushApplication {
	public static void main(String[] args) {
		SpringApplication.run(SsePushApplication.class, args);
	}
}
