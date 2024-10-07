package com.zelle.zelle_support;

import com.zelle.zelle_support.Model.Customer;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ZelleSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZelleSupportApplication.class, args);
	}

	@PostConstruct
	public void startup() {
	}
}
