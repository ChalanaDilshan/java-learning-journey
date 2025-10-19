import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        JLabel label = new JLabel();
        JButton incrementbutton = new JButton();
        JButton decrementbutton = new JButton();
        JButton HiButton = new JButton();

        incrementbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                count++;
                label.setText("Hello World...! "+count);
            }
        });

        decrementbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(count > 0){
                    count--;
                    label.setText("Hello World...! "+count);
                }
            }
        });

        HiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Hi...!");
            }
        });
        
        label.setText("Hello World...! "+count);
        incrementbutton.setText("Increment");
        decrementbutton.setText("Decrement");
        HiButton.setText("Welcome");

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.BLUE); //text color or main drawing 


        frame.setTitle("My first GUI Apllication");
        frame.setSize(420,320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(incrementbutton);
        frame.add(decrementbutton);
        frame.add(HiButton);
        
       // frame.getContentPane().setBackground(new Color(255,63,147));
    }
}
