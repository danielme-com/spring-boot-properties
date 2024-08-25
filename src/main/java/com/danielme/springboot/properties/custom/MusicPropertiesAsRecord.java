package com.danielme.springboot.properties.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("music")
public record MusicPropertiesAsRecord(String song) {
}
