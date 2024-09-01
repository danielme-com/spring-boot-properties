package com.danielme.springboot.properties.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("server")
public record ServerConfiguration(String name, String ip, String protocol, Security security) {

    public record Security(boolean enable, String token) {
    }

}
