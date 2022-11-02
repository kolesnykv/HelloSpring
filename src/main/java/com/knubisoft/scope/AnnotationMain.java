package com.knubisoft.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        MusicPlayer player = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();

    }
}
