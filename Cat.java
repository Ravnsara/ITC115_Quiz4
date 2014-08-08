package com.crome.Quiz4;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Cat implements AnimalSound{

	@Override
	public void makeSound() {

	    try {
	    	URL url = new URL("http://www.kessels.com/catsounds/cat9.wav");
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(url);
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

		
	}
	
}
