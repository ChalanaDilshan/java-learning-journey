package CheckBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Myframe extends JFrame implements ActionListener {
    
    JCheckBox Check1,Check2;
    TextField textField;
    
    Myframe(){

        Check1 = new JCheckBox("Bold");
        Check2 = new JCheckBox("Italic");

        textField = new TextField();
        textField.setColumns(20);

        this.setLayout(new FlowLayout());
        this.add(Check1);
        this.add(Check2);
        this.add(textField);

        Check1.addActionListener(this);
        Check2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
       int bold = 0;
       int italic = 0;

       if (Check1.isSelected()){
        bold = Font.BOLD;
       }

       if (Check2.isSelected()){
        italic = Font.ITALIC;
       }

       textField.setFont(new Font("Times New Roman",bold | italic,12));
    }
}


public class Main{
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setTitle("Check Box");
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}