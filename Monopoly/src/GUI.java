import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI {
    JFrame game = new JFrame("Monpoly");

    JLabel dice1 = new JLabel();
    JLabel dice2 = new JLabel();
    Dice T1 = new Dice();
    Dice T2 = new Dice();
    JButton toss=new JButton("TOSS");

    private class TossButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand=new Random();
            int d1=rand.nextInt(6)+1;
            int d2=rand.nextInt(6)+1;
        }
    }
    void setFrame() {
        //setting frame
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setSize(800, 800);
        dice1.setLocation(200, 200);
        dice2.setLocation(400, 200);
        dice1.setIcon(new ImageIcon("img/1.png"));
        dice2.setIcon(new ImageIcon("img/1.png"));
        game.add(dice2);
        game.add(dice1);
        dice1.setSize(64,64);
        dice2.setSize(64,64);
//        dice2.setBackground(Color.cyan);
//        dice1.setBackground(Color.RED);
//        LayoutManager manager = new GridLayout();
//        game.setLayout(manager);
        game.add(toss);
        ActionListener tossListener=new TossButtonListener();
        toss.addActionListener(tossListener);
        toss.setSize(100,50);
        toss.setLocation(280,300);
    }

}
