package TextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Myframe extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;

    Myframe(){
        textField = new JTextField();
        textField.setColumns(15);
        textField.setText("Welcome");

        button = new JButton("Click");
        label = new JLabel("Empty Field");

        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(textField);
        this.add(label);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            label.setText(textField.getText());
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setTitle("Application");
        frame.setSize(620,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
