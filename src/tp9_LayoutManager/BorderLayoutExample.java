package tp9_LayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample extends JFrame implements ActionListener {
	
	JButton carre,cercle,r,v,b,j;
	JPanel nord,sud,centre;
	boolean isCarre = true;
	Color colorForme = Color.white;
	
	public BorderLayoutExample() {
		this.setTitle("exemple de FlowLayout");
		int x = Toolkit.getDefaultToolkit().getScreenSize().width;
		int y = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(x/2,y/2);
		this.setMinimumSize(new Dimension(400,400));
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.yellow);
		
		this.setLayout(new BorderLayout());
		
		carre = new JButton("Carre");
		carre.addActionListener(this);
		
		cercle = new JButton("Cercle");
		cercle.addActionListener(this);
		
		r = new JButton("Rouge");
		r.addActionListener(this);
		
		b = new JButton("Bleu");
		b.addActionListener(this);
		
		v = new JButton("Vert");
		v.addActionListener(this);
		
		j = new JButton("Jaune");
		j.addActionListener(this);
		
		nord = new JPanel(new FlowLayout());
		nord.setBackground(Color.pink);
		nord.add(carre);
		nord.add(cercle);
		sud = new JPanel(new FlowLayout());
		sud.add(r);
		sud.add(v);
		sud.add(b);
		sud.add(j);
		
		centre = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(colorForme);
				if(isCarre) {
					g.fillRect(centre.getWidth()/2-75, centre.getHeight()/2-75, 150, 150);
				}else {
					g.fillOval(centre.getWidth()/2-75, centre.getHeight()/2-75,150,150);
				}
			}
		};
		centre.setBackground(Color.orange);
		
		this.add(nord,BorderLayout.NORTH);
		this.add(sud,BorderLayout.SOUTH);
		this.add(centre,BorderLayout.CENTER);
		//frame.add(new JButton("Nord"), BorderLayout.NORTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==carre ) isCarre = true;
		if(e.getSource()==cercle ) isCarre = false;
		if(e.getSource()==r ) colorForme = Color.red;
		if(e.getSource()==b ) colorForme = Color.blue;
		if(e.getSource()==v ) colorForme = Color.green;
		if(e.getSource()==j ) colorForme = Color.yellow;
		repaint();
	}

}
