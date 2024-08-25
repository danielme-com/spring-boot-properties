package com.danielme.springboot.properties;

import com.danielme.springboot.properties.custom.MusicProperties;
import com.danielme.springboot.properties.custom.MusicPropertiesAsRecord;
import com.danielme.springboot.properties.custom.ServersProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomPropertiesTests {

    private static final String SONG_NAME = "Ride Like the Wind";
    @Value("${music.song}")
    private String song;

    @Autowired
    private Environment environment;

    @Autowired
    private MusicProperties musicProperties;

    @Autowired
    private ServersProperties serversProperties;

    @Autowired
    private MusicPropertiesAsRecord musicPropertiesRecord;

    @Test
    void testSongFromValue() {
        assertEquals(SONG_NAME, song);
    }

    @Test
    void testSongFromEnvironment() {
        String song = environment.getProperty("music.song");

        assertEquals(SONG_NAME, song);
    }

    @Test
    void testMusicPropertiesClass() {
        assertEquals(SONG_NAME, musicProperties.getSong());
    }

    @Test
    void testMusicPropertiesRecord() {
        assertEquals(SONG_NAME, musicPropertiesRecord.song());
    }

    @Test
    void testServerPropertiesClass() {
        assertEquals("email_server", serversProperties.getEmail());
        assertEquals("ftp_server", serversProperties.getFtp());
    }

}
