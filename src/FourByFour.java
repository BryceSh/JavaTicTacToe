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

public class FourByFour {

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
    private static JButton btn10;
    private static JButton btn11;
    private static JButton btn12;
    private static JButton btn13;
    private static JButton btn14;
    private static JButton btn15;
    private static JButton btn16;
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
        buttonPanel.setLayout(new GridLayout(4, 4));
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

        btn10 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(10, "player");
            }
        });

        btn11 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(11, "player");
            }
        });
        btn12 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(12, "player");
            }
        });
        btn13 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(13, "player");
            }
        });
        btn14 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(14, "player");
            }
        });
        btn15 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(15, "player");
            }
        });
        btn16 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placePlayerPiece(16, "player");
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
                btn10.setText(" ");
                btn11.setText(" ");
                btn12.setText(" ");
                btn13.setText(" ");
                btn14.setText(" ");
                btn15.setText(" ");
                btn16.setText(" ");
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
        btn10.setSize(btnSize);
        btn11.setSize(btnSize);
        btn12.setSize(btnSize);
        btn13.setSize(btnSize);
        btn14.setSize(btnSize);
        btn15.setSize(btnSize);
        btn16.setSize(btnSize);

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btn10);
        buttonPanel.add(btn11);
        buttonPanel.add(btn12);
        buttonPanel.add(btn13);
        buttonPanel.add(btn14);
        buttonPanel.add(btn15);
        buttonPanel.add(btn16);
        gameInfo.add(resetGame);
        gameInfo.add(infoText);

        frame.pack();
        frame.repaint();

        frame.setSize(300,500);

    }

    public static void checkWinner() {

        List<List> winning = new ArrayList<List>();
        winning.add(Arrays.asList(1,2,3,4));
        winning.add(Arrays.asList(5,6,7,8));
        winning.add(Arrays.asList(9,10,11,12));
        winning.add(Arrays.asList(13,14,15,16));
        winning.add(Arrays.asList(1,5,9,13));
        winning.add(Arrays.asList(2,6,10,14));
        winning.add(Arrays.asList(3,7,11,15));
        winning.add(Arrays.asList(4,8,12,16));
        winning.add(Arrays.asList(1,6,11,16));
        winning.add(Arrays.asList(4,7,10,13));


        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                gameOver = true;
                toggleButtons(false);
                infoText.setText("Player Wins!");
            }
            System.out.println("Tested: " + l);
        }
        for (List l : winning) {
            if (cpuPositions.containsAll(l)) {
                gameOver = true;
                toggleButtons(false);
                infoText.setText("CPU wins :( better luck next time.");
            }
        }
        if (playerPositions.size() + cpuPositions.size() == 16) {
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
        btn10.setEnabled(enabled);
        btn11.setEnabled(enabled);
        btn12.setEnabled(enabled);
        btn13.setEnabled(enabled);
        btn14.setEnabled(enabled);
        btn15.setEnabled(enabled);
        btn16.setEnabled(enabled);

    }

    public static void placePlayerPiece(int pos, String player) {

        // Checks to see if the player or CPU has already played that
        boolean placePiece = false;
        String symbol = " ";
        infoText.setText(" ");
        checkWinner();

        if (pos < 17) {
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
                } else if (pos == 10) {
                    btn10.setText(symbol);
                } else if (pos == 11) {
                    btn11.setText(symbol);
                } else if (pos == 12) {
                    btn12.setText(symbol);
                } else if (pos == 13) {
                    btn13.setText(symbol);
                } else if (pos == 14) {
                    btn14.setText(symbol);
                } else if (pos == 15) {
                    btn15.setText(symbol);
                } else if (pos == 16) {
                    btn16.setText(symbol);
                }


            }

        }

        checkWinner();

    }

    public static int cpuPositionPicker() {

        Random rand = new Random();
        int pickedPosition = rand.nextInt(16) + 1;
        while (playerPositions.contains(pickedPosition) || cpuPositions.contains(pickedPosition)) {
            pickedPosition = rand.nextInt(16) + 1;
            if (playerPositions.size() + cpuPositions.size() == 16) {
                System.out.println("Can't play, no more moves.");
                return 17;
            }
        }
        return pickedPosition;

    }

}

