import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import java.util.*;


public class GUI extends JFrame implements Serializable {
        JButton b1, b2, b3;
        JLabel l1, l2, l3;
        private JLabel l4;
        JTextField t1, t2, t3;
        double x, a, b, y;
        double w, q;
        private String c;
        eHandler handler = new eHandler();
    public GUI(String s){
        super(s);
        JPanel p = new JPanel();
        p.setLayout(null);
        add(p);
         b1 = new JButton("Посчитать");
         b1.setBounds(10,170,100,20);
         b2 = new JButton("Очистить");
         b2.setBounds(120,170,100,20);
         b3 = new JButton("Сохранить");
         b3.setBounds(230,170,100,20);
         l1 = new JLabel("Введите x");
         l1.setBounds(10,10,60,10);
         l2 = new JLabel("Введите a");
         l2.setBounds(10,60,60,10);
         l3 = new JLabel("Введите b");
         l3.setBounds(10,110,60,20);
         l4 = new JLabel();
         l4.setBounds(130,80,1000,20);
         t1 = new JTextField();
         t1.setBounds(10,30,60,20);
         t2 = new JTextField();
         t2.setBounds(10,80,60,20);
         t3 = new JTextField();
         t3.setBounds(10,140,60,20);
         
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(l4);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
}
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
            if(e.getSource()==b1){
                x = Double.parseDouble(t1.getText());
                a = Double.parseDouble(t2.getText());
                b = Double.parseDouble(t3.getText());
                q = Math.pow(Math.log10(x/a),2); 
                w = Math.exp(x/a); 
                y = (1+q)/(b-w);
                c = "Результат = "+y;
                l4.setText(c);
            }
            if(e.getSource()==b2){
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                l4.setText(null);
            }
            if(e.getSource()==b3){
                FileOutputStream fos = new FileOutputStream("Result.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(l4);
                oos.flush();
                oos.close();   
                }
            }
            catch (Exception ex){JOptionPane.showMessageDialog(null, "Введите в поле число");}
}
}
}