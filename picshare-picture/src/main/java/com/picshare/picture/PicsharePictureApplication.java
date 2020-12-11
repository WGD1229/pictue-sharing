package com.picshare.picture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wuguodong
 */
@SpringBootApplication
@MapperScan("com.picshare.picture.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class PicsharePictureApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicsharePictureApplication.class, args);
	}

}
