import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallTest extends JFrame{
	private MyPanel mp;
	private JButton btn;
	public BallTest() {
		this.setSize(600,500);
		this.setLocation(200,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mp = new MyPanel(40, 40);
		btn = new JButton("ÒÆ¶¯");
		btn.addActionListener(new btnClickListent());
		this.add(btn, BorderLayout.NORTH);
		this.add(mp);
		this.setVisible(true);
		
	}
	class MyPanel extends JPanel implements Runnable{
		private int x;
		private int y;
		public MyPanel(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.red);
			g.fillOval(x, y, 40, 40);
		}
		@Override
		public void run() {
			for(int i=0; i<20; i++){
				mp.x += 3;
				mp.repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	private class btnClickListent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn){
				new Thread(mp).start();
			}
		}
	}

	public static void main(String[] args) {
		BallTest bt = new BallTest();
		
	}
}
