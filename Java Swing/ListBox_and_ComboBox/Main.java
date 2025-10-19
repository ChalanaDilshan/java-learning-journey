package ListBox_and_ComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Myframe extends JFrame implements ListSelectionListener,ActionListener{
    JList listBox;
    JComboBox Combobox;

    Myframe(){

        String[] Languages = {"Java","python","PHP","JavaScript","C#"};

        listBox = new JList<>(Languages);
        Combobox = new JComboBox<>(Languages);

        listBox.setVisibleRowCount(3);
        this.setLayout(new FlowLayout());
        this.add(new JScrollPane(listBox));
        this.add(Combobox);

        listBox.addListSelectionListener(this);
        Combobox.addActionListener(this);
    }

    public void valueChanged(ListSelectionEvent e){
        if(e.getSource() == listBox){
            System.out.println(listBox.getSelectedValuesList());
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Combobox){
            System.out.println(Combobox.getSelectedItem());
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Myframe frame = new Myframe();
        frame.setTitle("List and combo Box");
        frame.setSize(640,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
