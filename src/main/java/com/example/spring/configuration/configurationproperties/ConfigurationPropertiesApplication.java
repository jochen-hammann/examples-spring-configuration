package com.example.spring.configuration.configurationproperties;

import com.example.spring.configuration.configurationproperties.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(Config.class)
@ConfigurationPropertiesScan({ "com.example.spring.configuration.configurationproperties.config" })
public class ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertiesApplication.class, args);
	}

}
