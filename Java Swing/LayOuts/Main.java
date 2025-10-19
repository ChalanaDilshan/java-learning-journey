package LayOuts;

import java.awt.FlowLayout;
import javax.swing.*;

class Myframe extends JFrame {

    JButton bt1,bt2,bt3,bt4,bt5;

    Myframe(){

        bt1 = new JButton("Button 1");
        bt2 = new JButton("Button 2");
        bt3 = new JButton("Button 3");
        bt4 = new JButton("Button 4");
        bt5 = new JButton("Button 5");
        
        // this.setLayout(new BorderLayout());
        // this.add(bt1,BorderLayout.NORTH);
        // this.add(bt2,BorderLayout.EAST);
        // this.add(bt3,BorderLayout.WEST);
        // this.add(bt4,BorderLayout.SOUTH);
        // this.add(bt5,BorderLayout.CENTER);

        FlowLayout f = new FlowLayout();
        f.setAlignment(FlowLayout.LEFT);
        this.setLayout(f);
        this.add(bt1);
        this.add(bt2);
        this.add(bt3);
        this.add(bt4);
        this.add(bt5);


    }
}

public class Main{
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setTitle("Layout");
        frame.setSize(680,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
