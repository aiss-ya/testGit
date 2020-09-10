package com.ly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringRun {
	public static void main(String[] args) {
		SpringApplication.run(SpringRun.class, args);
		System.out.println("第一次新建项目");
		System.out.println("第一次更新项目");
		System.out.println("创建分支dev");
		System.out.println("主干添加");
		System.out.println("分支添加");
		System.out.println("在线更新");
		
		
	}
}
