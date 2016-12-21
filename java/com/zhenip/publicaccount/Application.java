package com.zhenip.publicaccount;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目的启动入口
 * 
 * @author yinchunlei
 * @date 2016年9月14日
 */
@RestController
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Application {

	private static Logger logger = Logger.getLogger(Application.class);

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("============= SpringBoot Start Success =============");
	}

	/************************************************************************/

}
