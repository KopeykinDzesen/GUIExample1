import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseMotionListener;

public class Main extends JFrame {

    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i1, i2;
    String s1, s2;

    public Main(String s){

        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Очистить");
        b2 = new JButton("Посчитать");
        l1 = new JLabel("Введите первое число:");
        l2 = new JLabel("Введите второе число:");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b2);
        add(b1);
        add(l3);
        add(l4);

        EHandler eHandler = new EHandler();
        b1.addActionListener(eHandler);
        b2.addActionListener(eHandler);

    }

    public class EHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                if (e.getSource() == b2) {

                    i1 = Integer.parseInt(t1.getText());
                    i2 = Integer.parseInt(t2.getText());
                    i1++;
                    i2++;
                    s1 = "Теперь ваша первая строка = " + i1;
                    s2 = "Теперь ваша вторая строка = " + i2;
                    l3.setText(s1);
                    l4.setText(s2);

                }

                if (e.getSource() == b1) {

                    t1.setText("");
                    t2.setText("");
                    l3.setText("");
                    l4.setText("");

                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Введите число!");
            }

        }

    }

    public static void main(String[] args) {

       Main main = new Main("Мой первый GUI");
       main.setVisible(true);
       main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       main.setSize(300, 200);
       main.setLocationRelativeTo(null);

    }

}
