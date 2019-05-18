import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Dice {
Random t=new Random();
private int number;
    Label dice=new Label();

public void toss(){
    number=t.nextInt(6)+1;
}
public void chooseIcon(int d) {
    switch (d) {
        case 1:
            this.setIcon(new ImageIcon("img/1.png"));
            break;
        case 2:
            this.setIcon(new ImageIcon("img/2.png"));
            break;
        case 3:
            this.setIcon(new ImageIcon("img/3.png"));
            break;
        case 4:
            this.setIcon(new ImageIcon("img/4.png"));
            break;
        case 5:
            this.setIcon(new ImageIcon("img/5.png"));
            break;
        case 6:
            this.setIcon(new ImageIcon("img/6.png"));
            break;
        }
    }
}
