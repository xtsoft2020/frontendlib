package com.neusoft.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.neusoft.oa.hr.mapper")
public class HospitalWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalWebAppApplication.class, args);
	}

}
