package com.knubisoft;

import com.knubisoft.scope.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
