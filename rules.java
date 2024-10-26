
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class rules extends JFrame implements ActionListener {
    String name;
    JButton Starts, back;

    rules() {
       
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome to Simple minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(

                "<html>" +
                        "1.You are  trained to be a programmer and not a story teller, answer point to point.  "
                        + "<br><br>" +
                        "2. Do not unncessarily Smile  at the person sitting next to you , they may also not know the answer. "
                        + "<br><br>" +
                        "3. Always remember english is just a language not measurement tool to masure someone knowledge, be confident. "
                        + "<br><br>" +
                        "4. Be always quit and a good listener  because 90% Problems comes from talking too much. "
                        + "<br><br>" +
                        "5. Be humble and respectful to everyone the world is too small everything comes back to you. "
                        +
                        "<html>");
        add(rules);

        back = new JButton("back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        Starts = new JButton("Starts");
        Starts.setBounds(400, 500, 100, 30);
        Starts.setBackground(new Color(30, 144, 254));
        Starts.setForeground(Color.BLACK);
        Starts.addActionListener(this);
        add(Starts);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Starts) {
            setVisible(false);
            new quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new rules();
    }
}
