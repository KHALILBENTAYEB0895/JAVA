package tp9_LayoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutExample extends JFrame implements ActionListener{
	JButton b_sauvegarder,b_annuler;
	JLabel labelNom, labelPrenom, labelAge, labelNord, labelSud;
	JTextField textNom, textPrenom, textAge;
	JPanel panelSud, panelNord, panelCentre, panelMain;
	
	public GridLayoutExample() {
		this.setTitle("exemple de GridLayout");
		int x = Toolkit.getDefaultToolkit().getScreenSize().width;
		int y = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(x/2,y/2);
		this.setMinimumSize(new Dimension(400,400));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		b_sauvegarder = new JButton("Sauvegarder");
		b_sauvegarder.addActionListener(this);
		
		b_annuler = new JButton("Annuler");
		b_annuler.addActionListener(this);
		
		labelNord = new JLabel("Saisir les infos du client",0);
		labelSud = new JLabel("Realise par moi",0);
		labelNom = new JLabel("Nom : ",JLabel.CENTER);
		labelPrenom = new JLabel("Prenom : ",JLabel.CENTER);
		labelAge = new JLabel("Age : ",JLabel.CENTER);
		
		panelCentre  = new JPanel(new GridLayout(4,2));
		textNom = new JTextField();
		textPrenom = new JTextField();
		textAge = new JTextField();
		
		panelCentre.add(labelNom);
		panelCentre.add(textNom);
		
		panelCentre.add(labelPrenom);
		panelCentre.add(textPrenom);
		
		panelCentre.add(labelAge);
		panelCentre.add(textAge);
		
		panelCentre.add(b_sauvegarder);
		panelCentre.add(b_annuler);
		
		
		this.add(labelNord,BorderLayout.NORTH);
		this.add(panelCentre,BorderLayout.CENTER);
		this.add(labelSud,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b_annuler) {
			textNom.setText("");
			textPrenom.setText("");
			textAge.setText("");
		}
		if(e.getSource()==b_sauvegarder) {
			System.out.println(textNom.getText()+" , "+textPrenom.getText()+" , "+textAge.getText());
		}
		
	}
	
	public static void main(String[] args) {
		new GridLayoutExample();
	}

}
