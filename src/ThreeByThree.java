/*

  _    _ _     _       _ _   _  _____
 | |  | | |   (_)     (_) | (_)/ ____|
 | |  | | |__  _ _ __  _| |_ _| (___
 | |  | | '_ \| | '_ \| | __| |\___ \
 | |__| | |_) | | | | | | |_| |____) |
  \____/|_.__/|_|_| |_|_|\__|_|_____/

This script made by Bryce Sheridan, https://github.com/UbinitiS

This is the THIRD version of TicTacToe. This one is going to be GUI based, so you don't have to keep using the console.
This script is pretty much just the basic TicTacToe engine that I built previously on TicTacToe2 but somewhat re-wrote
to allow a GUI to be used. Other than that, most of the main logic is all the same.

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ThreeByThree {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    private static JButton btn1;
    private static JButton btn2;
    private static JButton btn3;
    private static JButton btn4;
    private static JButton btn5;
    private static JButton btn6;
    private static JButton btn7;
    private static JButton btn8;
    private static JButton btn9;
    private static boolean gameOver = false; // No touchy!!!
    private static JLabel infoText;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(300, 450);
        frame.setVisible(true);
        frame.setResizable(false);

        JPanel contentPanel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(contentPanel, BoxLayout.Y_AXIS);
        contentPanel.setLayout(boxlayout);
        contentPanel.setSize(new Dimension(300, 450));
        frame.add(contentPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setBounds(0, 60,300,300);
        contentPanel.add(buttonPanel);

        JPanel gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(2,1));
        contentPanel.add(gameInfo);

        btn1 = new JButton(new AbstractAction("") {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(1, "player");
            }
        });
        btn2 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(2, "player");
            }
        });
        btn3 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(3, "player");
            }
        });
        btn4 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(4, "player");
            }
        });
        btn5 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(5, "player");
            }
        });
        btn6 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(6, "player");
            }
        });
        btn7 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(7, "player");
            }
        });
        btn8 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(8, "player");
            }
        });
        btn9 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(9, "player");
            }
        });

        JButton resetGame = new JButton(new AbstractAction("Reset Game") {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleButtons(true);
                playerPositions.clear();
                cpuPositions.clear();
                btn1.setText(" ");
                btn2.setText(" ");
                btn3.setText(" ");
                btn4.setText(" ");
                btn5.setText(" ");
                btn6.setText(" ");
                btn7.setText(" ");
                btn8.setText(" ");
                btn9.setText(" ");
                infoText.setText("Click any button to begin!");
            }
        });

        infoText = new JLabel("Click any button to begin!", SwingConstants.CENTER);
        infoText.setVisible(true);

        Dimension btnSize = new Dimension(50, 50);
        btn1.setSize(btnSize);
        btn2.setSize(btnSize);
        btn3.setSize(btnSize);
        btn4.setSize(btnSize);
        btn5.setSize(btnSize);
        btn6.setSize(btnSize);
        btn7.setSize(btnSize);
        btn8.setSize(btnSize);
        btn9.setSize(btnSize);

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        gameInfo.add(resetGame);
        gameInfo.add(infoText);

        frame.pack();
        frame.repaint();

        frame.setSize(300,500);

    }

    public static void checkWinner() {

        List<List> winning = new ArrayList<List>();
        winning.add(Arrays.asList(1,2,3));
        winning.add(Arrays.asList(4,5,6));
        winning.add(Arrays.asList(7,8,9));
        winning.add(Arrays.asList(1,4,7));
        winning.add(Arrays.asList(2,5,8));
        winning.add(Arrays.asList(3,6,9));
        winning.add(Arrays.asList(1,5,9));
        winning.add(Arrays.asList(3,5,7));
        winning.add(Arrays.asList(1,3,7,9));

        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                gameOver = true;
                toggleButtons(false);
                infoText.setText("Player Wins!");
            }
        }
        for (List l : winning) {
            if (cpuPositions.containsAll(l)) {
                gameOver = true;
                toggleButtons(false);
                infoText.setText("CPU wins :( better luck next time.");
            }
        }
        if (playerPositions.size() + cpuPositions.size() == 9) {
            gameOver = true;
            infoText.setText("Tie!");
            toggleButtons(false);

        }

    }

    public static void toggleButtons(boolean enabled) {

        btn1.setEnabled(enabled);
        btn2.setEnabled(enabled);
        btn3.setEnabled(enabled);
        btn4.setEnabled(enabled);
        btn5.setEnabled(enabled);
        btn6.setEnabled(enabled);
        btn7.setEnabled(enabled);
        btn8.setEnabled(enabled);
        btn9.setEnabled(enabled);

    }

    public static void placePlayerPiece(int pos, String player) {

        // Checks to see if the player or CPU has already played that
        boolean placePiece = false;
        String symbol = " ";
        infoText.setText(" ");
        checkWinner();

        if (pos < 10) {
            if (playerPositions.contains(pos) || cpuPositions.contains(pos)) {

                infoText.setText("Sorry! You can't go there. Try again");

            } else {

                if (player.equals("player")) {

                    playerPositions.add(pos);
                    symbol = "X";
                    placePiece = true;
                    placePlayerPiece(cpuPositionPicker(), "cpu");

                } else if (player.equals("cpu")) {

                    cpuPositions.add(pos);
                    symbol = "O";
                    placePiece = true;

                } else {

                    System.err.println("Trying to call a player that does not exist!");

                }

            }
            if (placePiece) {

                if (pos == 1) {
                    btn1.setText(symbol);
                } else if (pos == 2) {
                    btn2.setText(symbol);
                } else if (pos == 3) {
                    btn3.setText(symbol);
                } else if (pos == 4) {
                    btn4.setText(symbol);
                } else if (pos == 5) {
                    btn5.setText(symbol);
                } else if (pos == 6) {
                    btn6.setText(symbol);
                } else if (pos == 7) {
                    btn7.setText(symbol);
                } else if (pos == 8) {
                    btn8.setText(symbol);
                } else if (pos == 9) {
                    btn9.setText(symbol);
                }


            }

        }

        checkWinner();

    }

    public static int cpuPositionPicker() {

        Random rand = new Random();
        int pickedPosition = rand.nextInt(9) + 1;
        while (playerPositions.contains(pickedPosition) || cpuPositions.contains(pickedPosition)) {
            pickedPosition = rand.nextInt(9) + 1;
            if (playerPositions.size() + cpuPositions.size() == 9) {
                return 10;
            }
        }
        return pickedPosition;

    }

}

