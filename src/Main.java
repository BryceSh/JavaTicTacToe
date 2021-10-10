import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Java Tic Tac Toe");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,1));
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        frame.add(buttonPanel);

        JButton threeByThree = new JButton(new AbstractAction("3x3") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThreeByThree three = new ThreeByThree();
                three.main(null);
            }
        });
        threeByThree.setVisible(true);
        threeByThree.setPreferredSize(new Dimension(150,50));

        JButton fourByFour = new JButton(new AbstractAction("4x4") {
            @Override
            public void actionPerformed(ActionEvent e) {
                FourByFour four = new FourByFour();
                four.main(null);
            }
        });
        fourByFour.setVisible(true);
        fourByFour.setPreferredSize(new Dimension(150,50));

        JLabel topText = new JLabel("Tic-Tac-Toe");
        topText.setVisible(true);

        buttonPanel.add(threeByThree, gbc);
        buttonPanel.add(fourByFour, gbc);

        frame.pack();
        frame.repaint();

        frame.setSize(600,250);


    }
}
