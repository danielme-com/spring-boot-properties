package com.danielme.springboot.properties.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("custom")
public record CustomPropertiesAsRecord(String song) {
}
