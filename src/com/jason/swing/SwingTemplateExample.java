package com.jason.swing;

import java.awt.Graphics;

import javax.swing.JFrame;


public class SwingTemplateExample extends JFrame{
	public SwingTemplateExample(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		String msg = "I rule!!";
		g.drawString(msg, 120, 120);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingTemplateExample swingObserverExample = new SwingTemplateExample("My jframe");
	}


}