package com.crome.Quiz4;
	/*
	 * 
	 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Form {
	private JFrame frame;
	private JPanel panel;
	private JButton btnCat;
	private JButton btnDog;
	
	//set constants for frames
    private final int OFFSETX = 460;
    private final int OFFSETY = 150;
    private final int x = 250;
    private final int y = 80;
    
    public Form(){
        createFrame();
    }
    
    private void createFrame(){
        frame = new JFrame();
        frame.add(createPanel());
        frame.setTitle("Animal Sounds");
        frame.setBounds(OFFSETX, OFFSETY, x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private JPanel createPanel(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(1,2,4,4));
        
        
        btnCat = new JButton("Cat");
        btnCat.addActionListener(new CatListener());
        
        btnDog = new JButton("Dog");
        btnDog.addActionListener(new DogListener());
                
        panel.add(btnCat);        
        panel.add(btnDog);
                        
        return panel;
    }
    
    private class CatListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Cat cat = new Cat();
			cat.makeSound();			
		}    	
    }
    
    private class DogListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Dog dog = new Dog();
			dog.makeSound();			
		}    	
    }    
}
