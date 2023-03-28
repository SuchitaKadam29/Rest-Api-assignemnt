package com.rest.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.webservices.repository.DBUtil;

@SpringBootApplication
public class SpringRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
		
		DBUtil x=new DBUtil();
		System.out.println(x.getDBConnection());
	}

}
