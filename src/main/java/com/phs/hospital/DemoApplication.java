package com.phs.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = { "com.phs.hospital.core.common", "com.phs.hospital.core.service","com.phs.hospital.core.dal","com.phs.hospital.web"})
@MapperScan(basePackages = {"com.phs.hospital.core.dal.dao"})
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class},scanBasePackages = "com.phs.hospital")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
