package com.crome.Quiz4;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Dog implements AnimalSound{

	@Override
	public void makeSound() {
		 try {
		    	URL url = new URL("http://free-sounds.net/sound-files/animal-sounds/dog-sounds/DOG11.WAV");
	            Clip clip = AudioSystem.getClip();
	            AudioInputStream inputStream = AudioSystem.getAudioInputStream(url);
	            clip.open(inputStream);
	            clip.start();
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
		
	}

}
