package tp9_LayoutManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample2 extends JFrame {
	
	JButton r,v,b,j;
	JPanel dessin;
	
	public FlowLayoutExample2() {
		this.setTitle("exemple de FlowLayout");
		int x = Toolkit.getDefaultToolkit().getScreenSize().width;
		int y = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(x/2,y/2);
		this.setMinimumSize(new Dimension(100,400));
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.pink);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER,50,30));
		
		dessin = new JPanel();
		dessin.setPreferredSize(new Dimension(100,100));
		dessin.setBackground(Color.black);
		r = new JButton("Rouge");
		r.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dessin.setBackground(Color.red);
			}
		});
		v = new JButton("Vert");
		v.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dessin.setBackground(Color.green);
			}
		});
		b = new JButton("Bleu");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dessin.setBackground(Color.blue);
			}
		});
		j = new JButton("Jaune");
		j.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dessin.setBackground(Color.yellow);
			}
		});
		this.add(r);
		this.add(v);
		this.add(b);
		this.add(j);
		this.add(dessin);
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutExample2();
	}

}
