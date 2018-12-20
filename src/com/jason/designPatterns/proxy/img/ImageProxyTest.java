package com.jason.designPatterns.proxy.img;

import java.awt.Color;
import java.awt.Container;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class ImageProxyTest {
	
	public static void main(String[] arg) {
		try {
			// 显示应用 GUI
			// whowGUI();
			// 显示图片
			createAndShowIcon();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 创建并显示GUI。出于线程安全的考虑， 这个方法在事件调用线程中调用。
	 * 标签由JLabel类定义，JLabel类提供了多种构造方法，可以创造多种标签：
	 * 
	 * public JLabel():创建一个不带图标和文本的JLabel对象；
	 * 
	 * public JLabel(Icon icon):创建一个带图标的JLabel对象 ；
	 * 
	 * public JLabel(Icon icon,int aligment):创建一个带图标的JLabel对象，并设置图标水平对齐方式；
	 * 
	 * public JLabel(String text,int aligment):创建一个带文本的JLabel对象，并设置文字水平对齐方式；
	 * 
	 * public JLabel(String text,Icon icon,int
	 * aligment):创建一个带文本、带图标的JLabel对象，并设置标签内部的水平对其格式。
	 */
	private static void createAndShowGUI() {
		// 确保一个漂亮的外观风格
		JFrame.setDefaultLookAndFeelDecorated(true);
		// 创建及设置窗口
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 添加 "Hello World" 标签
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		// 显示窗口
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * 创建并显示图片
	 * 
	 * @throws MalformedURLException
	 */
	private static void createAndShowIcon() throws MalformedURLException {
		URL imageURL = new URL(
				"https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=785499509,2778770745&fm=26&gp=0.jpg");
		// 创建一个JFrame窗口
		JFrame jf = new JFrame();
		// 设置窗体大小
		jf.setSize(800, 600);
		// 使窗体可视
		jf.setVisible(true);
		// 设置窗体的关闭方式
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		// 将窗体转换为容器，然后在容器中添加组件
		Container container = jf.getContentPane();
		//创建组件
		Icon icon = new ImageProxy(imageURL);
		// 添加组件并设置布局管理器 字体居中显示
		JLabel jlabel = new JLabel("", icon, SwingConstants.CENTER);
		// 设置容器的背景颜色
		container.setBackground(Color.BLACK);
		// 在容器中添加组件
		container.add(jlabel);
	}

	/**
	 * 创建并显示GUI。出于线程安全的考虑， 这个方法在事件调用线程中调用。
	 */
	private static void whowGUI() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
