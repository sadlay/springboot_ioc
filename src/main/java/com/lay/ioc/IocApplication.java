package com.lay.ioc;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.lay.ioc.config.AppConfig;
import com.lay.ioc.pojo.DataBaseProperties;
import com.lay.ioc.pojo.DataBasePropertiesTwo;
import com.lay.ioc.pojo.Programmer;
import com.lay.ioc.pojo.User;
import com.lay.ioc.pojo.definiion.Person;
import com.lay.ioc.service.UserService;
import com.lay.ioc.utils.SpringUtil;

@SpringBootApplication
@PropertySource(value= {"classpath:test.properties"},ignoreResourceNotFound=true)
public class IocApplication {
	private static Logger log = LoggerFactory.getLogger(IocApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
		DataBasePropertiesTwo data=SpringUtil.getBean(DataBasePropertiesTwo.class);
		System.out.println(data.getDriverName());
		System.out.println(data.getUrl());
		System.out.println(data.getUsername());
		System.out.println(data.getPassword());
	}
}
