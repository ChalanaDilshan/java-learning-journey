package TextArea;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


class Myframe extends JFrame implements ActionListener {
    JButton button;
    JTextArea textArea;

    Myframe(){
        textArea = new JTextArea(20,40);
        button = new JButton("Add text");

        this.setLayout(new FlowLayout());
        this.add(textArea);
        this.add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println(textArea.getText());
           // textArea.append("Hello");
           // textArea.insert("Hello",0);
           System.out.println(textArea.getCaretPosition());
        }
    }
}

public class Main {
    public static void main(String[] args) {
       Myframe frame = new Myframe();
       frame.setTitle("Text Area");
       frame.setSize(600,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}
