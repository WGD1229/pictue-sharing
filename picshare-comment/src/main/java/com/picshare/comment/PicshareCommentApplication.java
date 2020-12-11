package com.picshare.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wuguodong
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PicshareCommentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicshareCommentApplication.class, args);
	}

}
