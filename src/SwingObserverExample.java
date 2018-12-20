

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingObserverExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
	}

	public void go() {
		JFrame jFrame = new JFrame();
		jFrame.setBounds(120,120,100,100);
		jFrame.setVisible(true);
		
		JLabel jLabel = new JLabel("Should I do it?");
		JButton jButtony = new JButton("yes");
		JButton jButtonn = new JButton("no");
		jButtonn.addActionListener(new AngelListener());
		jButtony.addActionListener(new DevilListener());
		
		jFrame.getContentPane().add(jLabel,BorderLayout.NORTH);
		jFrame.getContentPane().add(jButtony,BorderLayout.EAST);
		jFrame.getContentPane().add(jButtonn,BorderLayout.WEST);
		
		JDialog jDialog = new JDialog(jFrame);
		jDialog.setVisible(false);
	}
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Do not do it,you might regret it!");
		}
		
	}

	class DevilListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on,do it!");
		}
		
	}

}

