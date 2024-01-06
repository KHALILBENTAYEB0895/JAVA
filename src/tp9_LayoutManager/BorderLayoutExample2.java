package tp9_LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayoutExample2 {
    public static void main(String[] args) {
        // Création d'une fenêtre
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Création d'un gestionnaire de disposition BorderLayout
        BorderLayout borderLayout = new BorderLayout();

        // Attribution du gestionnaire de disposition à la fenêtre
        frame.setLayout(borderLayout);

        // Ajout de boutons à différentes régions de la fenêtre
        frame.add(new JButton("Nord"), BorderLayout.NORTH);
        frame.add(new JButton("Sud"), BorderLayout.SOUTH);
        frame.add(new JButton("Est"), BorderLayout.EAST);
        frame.add(new JButton("Ouest"), BorderLayout.WEST);
        frame.add(new JButton("Centre"), BorderLayout.CENTER);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}

