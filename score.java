import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener {

    score(String name, int score) {
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i2 = new ImageIcon("icons/score.jpeg");
        Image i1 = i2.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel(" Thank you " + name + " for playing Simple Minds ");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 27));
        add(heading);

        JLabel llscore = new JLabel(" your score is " + score);
        llscore.setBounds(380, 200, 300, 30);
        llscore.setFont(new Font("Tahoma", Font.PLAIN, 27));
        add(llscore);

        JButton next = new JButton("Play Again");
        next.setBounds(400, 270, 120, 30);

        next.setBackground(new Color(30, 144, 225));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new score("user", 0);

    }
}
