package com.jason.designPatterns.proxy.img;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 * 虚拟代理
 * @author liuwch
 * @creation 2018-8-27
 */
public class ImageProxy implements Icon {
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	public ImageProxy(URL url) {
		imageURL = url;
	}

	@Override
	public void paintIcon(final Component c, Graphics g,int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover , please wait ....", x + 300,
					y + 200);
			if (!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "CD cover");
							//重新绘制
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}
		return 800;
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}
		return 600;
	}

}
