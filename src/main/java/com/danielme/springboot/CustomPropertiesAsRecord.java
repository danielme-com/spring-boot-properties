package com.danielme.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("custom")
public record CustomPropertiesAsRecord(String song) {
}
