package com.minikube.sample.properties;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created By Gorantla, Eresh on 17/Dec/2019
 **/
@Configuration
@ConfigurationProperties(prefix = "app.data")
@Getter
@Setter
public class PropertiesConfig {

	private String test;
	private String name;
}
