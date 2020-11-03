package com.ssa.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.ssa.config.AppPropertiesConfig;

import lombok.Data;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ssnapp")
@Data
public class AppPropertiesConfig {
	private Map<String, String> messages = new HashMap<>();
}
