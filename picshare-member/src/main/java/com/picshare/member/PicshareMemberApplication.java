package com.picshare.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.picshare.member.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class PicshareMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicshareMemberApplication.class, args);
	}

}
