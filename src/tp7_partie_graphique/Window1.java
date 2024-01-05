package tp7_partie_graphique;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window1 extends JFrame{

	JPanel myPanel;
	
	public Window1(){
		this.setTitle("Ma fenetre");
		this.setBounds(200, 200, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.yellow);
		
	myPanel = new JPanel() {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.red);
			g.fillRect(0, 0, 200, 50);
		}
	};	
		this.setContentPane(myPanel);
	
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				System.out.println("une touche clavier appuyee !! ");
				moveWindow(e.getKeyCode());
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.out.println(" une petite clique de souris !! ");
				setBackgroundRnadomColor();
			}
		});
	}
	
	private void moveWindow(int keyCode) {
		int step = 10;
		int currentX = getX();
		int currentY = getY();
		
		switch(keyCode) {
			case KeyEvent.VK_LEFT:
				setLocation(currentX-step,currentY);break;
			case KeyEvent.VK_RIGHT:
				setLocation(currentX+step,currentY);break;
			case KeyEvent.VK_UP:
				setLocation(currentX,currentY-step);break;
			case KeyEvent.VK_DOWN:
				setLocation(currentX,currentY+step);break;
		}
	}
	
	private void setBackgroundRnadomColor() {
		Random random = new Random();
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		Color randomColor = new Color(red,green,blue);
		getContentPane().setBackground(randomColor);
	}
	
	public static void main(String[] args) {
		Window1 maFenetre = new Window1();
		maFenetre.setVisible(true);
	}

}
 