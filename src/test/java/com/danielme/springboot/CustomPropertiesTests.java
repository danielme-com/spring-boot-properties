package com.danielme.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomPropertiesTests {

    private static final String SONG_NAME = "ride like the wind";

    @Value("${song}")
    private String song;

    @Autowired
    private Environment environment;

    @Autowired
    private CustomProperties customProperties;

    @Autowired
    private ServersProperties serversProperties;

    @Test
    void testSongFromValue() {
        assertEquals(SONG_NAME, song);
    }

    @Test
    void testSongFromEnvironment() {
        String song = environment.getProperty("song");

        assertEquals(SONG_NAME, song);
    }

    @Test
    void testConfigurationPropertiesClass() {
        assertEquals(SONG_NAME, customProperties.getSong());
    }

    @Test
    void testServerPropertiesClass() {
        assertEquals("email_server", serversProperties.getEmail());
        assertEquals("ftp_server", serversProperties.getFtp());
    }

}
