package tp9_LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Création d'une fenêtre
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Création d'un gestionnaire de disposition FlowLayout avec alignement à gauche
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);

        // Attribution du gestionnaire de disposition à la fenêtre
        frame.setLayout(flowLayout);

        // Ajout de boutons à la fenêtre
        frame.add(new JButton("Bouton 1"));
        frame.add(new JButton("Bouton 2"));
        frame.add(new JButton("Bouton 3"));
        frame.add(new JButton("Bouton 4"));

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}

