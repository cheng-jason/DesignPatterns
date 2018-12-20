package com.jason.swing;

import java.applet.Applet;
import java.awt.Graphics;

public class AppletTemplateExample extends Applet {
	String msg;

	public void init() {
		msg = "Hello world,I am alive";
		repaint();
	}
	
	public void start() {
		msg = "Now,I am starting up ...";
		repaint();
	}
	
	public void stop() {
		msg = "Oh,I am being stopped  ...";
		repaint();
	}
	
	public void destroy() {
		msg = "Wow ,I am being destroyed  ...";
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg, 10, 15);
	}
}
