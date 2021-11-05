package com.NetDoc;

import com.NetDoc.properties.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class NetDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetDocApplication.class, args);
	}

}
